package helper;

import enums.*;
import exception.ApplicationException;
import model.Courier;
import model.Customer;
import model.Order;
import util.InputUtil;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class CustomerHelperService {
    private static long orderId;
    private static long CustomerId;
    private static CustomerHelperService instance;

    private CustomerHelperService(){}

    public static CustomerHelperService getInstance(){
        return instance == null ? new CustomerHelperService() : instance;
    }

    public Customer fillCustomer() {
        try {
            String name = InputUtil.getInstance().inputString("Enter the name: ");
            String surname = InputUtil.getInstance().inputString("Enter the surname: ");
            String phoneNumber = InputUtil.getInstance().inputString("Enter the phone number: ");
            String emailAddress = emailHelper();
            String password = passwordHelper();
            LocalDate registrationDate = LocalDate.now();
            return new Customer(++CustomerId, name, surname, phoneNumber,emailAddress,password, registrationDate);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public String emailHelper(){
        while(true) {
            String email = InputUtil.getInstance().inputString("Enter the email address: ");
            if (email.contains("@")) {
                break;
            } else{
                throw new ApplicationException(ExceptionEnum.INCORRECT_EMAIL);
            }
        }
        return null;
    }

    public String passwordHelper(){
        while (true){
            String password = InputUtil.getInstance().inputString("Enter the password: ");
            if (password.length() >= 8){
                break;
            } else {
                throw new ApplicationException(ExceptionEnum.INCORRECT_PASSWORD);
            }
        }
        return null;
    }

    public static double totalPizzaPrice(byte pizza, byte pizzaSize, byte sous){
        double pizzaPrice = 0;
        double pizzaSizePrice = 0;
        double sousPrice = 0;
        for (PizzaEnum pizzas : PizzaEnum.values()) {
            if (pizzas.getId() == pizza){
                pizzaPrice = pizzas.getPrice().doubleValue();
            }
        }
        for (PizzaSizeEnum sizes : PizzaSizeEnum.values()) {
            if (sizes.getId() == pizzaSize){
                pizzaSizePrice = sizes.getPrice().doubleValue();
            }
        }
        for (SousEnum souses : SousEnum.values()) {
            if (souses.getId() == sous){
                sousPrice = souses.getPrice().doubleValue();
            }
        }
        if (sous == 0){
            sousPrice = 0;
        }
        return pizzaPrice + pizzaSizePrice + sousPrice;
    }
    public  static Order order(byte pizza, byte pizzaSize, byte sous, double totalPizzaPrice,
                               Courier courier, Customer customer) {
        String pizzaType = null;
        String pizzaSizeType = null;
        String sousType = null;
        for (PizzaEnum pizzas : PizzaEnum.values()) {
            if (pizzas.getId() == pizza) {
                pizzaType = pizzas.getName();
            }
        }
        for (PizzaSizeEnum sizes : PizzaSizeEnum.values()) {
            if (sizes.getId() == pizzaSize) {
                pizzaSizeType = sizes.getName();
            }
        }
        for (SousEnum souses : SousEnum.values()) {
            if (souses.getId() == sous) {
                sousType = souses.getName();
            }
        }
        return new Order(++orderId, pizzaType, pizzaSizeType, sousType, BigDecimal.valueOf(totalPizzaPrice),
                LocalDateTime.now(), customer, courier, true);
    }

    public static void cashReceipt(Order order) {
        System.out.println("Start Date " + order.getStartTime() + "\n" +
                "Email: " + order.getCustomers().getEmailAddress() + "\n" +
                order.getPizzaName() + "  " + order.getPizzaSize() + "  " + order.getPrise() + "AZN" + " \n" +
                order.getSous() + "      \n" +
                "Courier name:              " + order.getCouriers().getCourierName() + " \n" +
                "Courier phoneNumber:     " + order.getCouriers().getPhoneNumber() + " \n" +
                "Courier vehicleType:     " + order.getCouriers().getVehicleType() + " \n" +
                "Courier vehiclePlate     " + order.getCouriers().getVehiclePlate() + " \n" +
                "Cash: " + order.getPrise());
    }

}
