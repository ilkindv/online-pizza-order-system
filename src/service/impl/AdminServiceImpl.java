package service.impl;

import data.GlobalData;
import enums.ExceptionEnum;
import enums.StatusEnum;
import exception.ApplicationException;
import helper.CourierHelperService;
import helper.LoginHelperService;
import model.Courier;
import model.Customer;
import model.Order;
import service.AdminService;


public class AdminServiceImpl implements AdminService {
    public long courierId;
    public long customerId;
    public long orderId;

    @Override
    public void login() {
        LoginHelperService.getInstance().login();
    }

    @Override
    public void addCourier() {
        Courier courier = CourierHelperService.getInstance().fillCourier();
        if (courier != null) {
            GlobalData.couriers.add(courier);
            StatusEnum.REGISTER_SUCCESSFULLY.getMessage();
        }
        throw new ApplicationException(ExceptionEnum.NOT_REGISTERED);
    }

    @Override
    public void trackOrders() {
        if (GlobalData.orders == null) {
            throw new ApplicationException(ExceptionEnum.THERE_ARE_NO_ORDERS_YET);
        }
        for (Order order: GlobalData.orders) {
            System.out.println(++orderId + ". " + order.getStartTime() + "----" + order.getDeliveryTime());
        }

    }

    @Override
    public void viewCouriers() {
        if (GlobalData.couriers == null) {
            throw new ApplicationException(ExceptionEnum.COURIERS_IS_NOT_LOGGED_IN_YET);
        }
        for (Courier courier: GlobalData.couriers) {
            System.out.println(++courierId + ". " + courier.getCourierName());
        }
    }

    @Override
    public void viewCustomers() {
        if (GlobalData.couriers == null) {
            throw new ApplicationException(ExceptionEnum.CUSTOMERS_IS_NOT_LOGGED_IN_YET);
        }
        for (Customer customer: GlobalData.customers) {
            System.out.println(++customerId + ". " + customer.getCustomerName() + " " + customer.getCustomerSurname());
        }
    }
}
