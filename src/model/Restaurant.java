package model;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class Restaurant {
    private String restaurantName;
    private String location;
    private BigDecimal restaurantTotalProfit;
    private long orders;
    private static Restaurant instance;

    private static Restaurant getInstance(){
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        instance = instance == null ? new Restaurant() : instance;
        lock.unlock();
        return instance;
    }

    public Restaurant() {
        this.restaurantName = "Pizza Restaurant";
        this.location = "Washington Street";
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public BigDecimal getRestaurantTotalProfit() {
        return restaurantTotalProfit;
    }

    public void incrementTotalProfit(BigDecimal restaurantTotalProfit) {
        this.restaurantTotalProfit = this.restaurantTotalProfit.add(restaurantTotalProfit);
    }

    public long getOrders() {
        return orders;
    }

    public void incrementOrders(long ordersCount) {
        this.orders += ordersCount;
    }

    public static void setInstance(Restaurant instance) {
        Restaurant.instance = instance;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantName='" + restaurantName + '\'' +
                ", location='" + location + '\'' +
                ", restaurantTotalProfit=" + restaurantTotalProfit +
                ", orders=" + orders +
                '}';
    }
}
