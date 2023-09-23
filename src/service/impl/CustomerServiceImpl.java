package service.impl;

import data.GlobalData;
import enums.ExceptionEnum;
import enums.PizzaEnum;
import enums.StatusEnum;
import exception.ApplicationException;
import helper.CourierHelperService;
import helper.CustomerHelperService;
import helper.LoginHelperService;
import model.Courier;
import model.Customer;
import model.Order;
import service.CustomerLoginManagementService;
import service.CustomerManagementService;
import service.CustomerService;
import util.MenuUtil;

import java.math.BigDecimal;

public class CustomerServiceImpl implements CustomerService {
    long orderId;
    @Override
    public void login() {
        LoginHelperService.getInstance().login();
    }

    @Override
    public void register() {
        Customer customer = CustomerHelperService.getInstance().fillCustomer();
        if (customer != null) {
            GlobalData.customers.add(customer);
            StatusEnum.REGISTER_SUCCESSFULLY.getMessage();
        }
        throw new ApplicationException(ExceptionEnum.NOT_REGISTERED);
    }

    @Override
    public void placeOrder(Customer customer) {
        byte pizza = MenuUtil.getInstance().pizzaMenu();
        byte pizzaSize = MenuUtil.getInstance().sizeMenu();
        byte sous = MenuUtil.getInstance().sousMenu();
        if (sous == 4){
            sous = 0;
        }
        double totalOrder = CustomerHelperService.totalPizzaPrice(pizza,pizzaSize,sous);
        int option = MenuUtil.getInstance().paymentMenu();
        switch (option) {
            case 1:
                if (customer.getMoneyAccount().doubleValue() < totalOrder) {
                    throw new RuntimeException();
                }
                customer.setMoneyAccount(BigDecimal.valueOf(customer.getMoneyAccount().doubleValue() - totalOrder));

                for (Courier courier : GlobalData.couriers) {
                    if (!courier.isAvailabilityStatus()) {
                        courier.setAvailabilityStatus(true);
                        Order order = CustomerHelperService.order(pizza,pizzaSize,sous,totalOrder,courier,customer);
                        CustomerHelperService.cashReceipt(order);
                        break;
                    }
                }
            case 2:
                CustomerLoginManagementService customerLoginManagementService = new CustomerLoginManagementServiceImpl();
                customerLoginManagementService.manage(customer);
            default:
                throw new RuntimeException();
        }
    }

    @Override
    public void trackOrder() {

    }

    @Override
    public void cancelOrder() {

    }
}
