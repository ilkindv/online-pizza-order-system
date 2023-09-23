package service;

import model.Courier;
import model.Customer;

public interface CustomerService {
    void login();
    void register();
    void placeOrder(Customer customer);
    void trackOrder();
    void cancelOrder();

}
