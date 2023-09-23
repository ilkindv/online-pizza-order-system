package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private long orderId;
    private String pizzaName;
    private String pizzaSize;
    private String sous;
    private BigDecimal prise;
    private LocalDateTime startTime;
    private LocalDateTime deliveryTime;
    private Customer customers;
    private Courier couriers;
    private boolean deliveryStatus;

    public Order(long orderId, String pizzaName, String pizzaSize, String sous, BigDecimal prise,
                 LocalDateTime startTime,Customer customers,
                 Courier couriers, boolean deliveryStatus) {
        this.orderId = orderId;
        this.pizzaName = pizzaName;
        this.pizzaSize = pizzaSize;
        this.sous = sous;
        this.prise = prise;
        this.startTime = startTime;
        this.customers = customers;
        this.couriers = couriers;
        this.deliveryStatus = deliveryStatus;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getSous() {
        return sous;
    }

    public void setSous(String sous) {
        this.sous = sous;
    }

    public BigDecimal getPrise() {
        return prise;
    }

    public void setPrise(BigDecimal prise) {
        this.prise = prise;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Customer getCustomers() {
        return customers;
    }

    public void setCustomers(Customer customers) {
        this.customers = customers;
    }

    public Courier getCouriers() {
        return couriers;
    }

    public void setCouriers(Courier couriers) {
        this.couriers = couriers;
    }

    public boolean isDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(boolean deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", pizzaName='" + pizzaName + '\'' +
                ", pizzaSize='" + pizzaSize + '\'' +
                ", sous='" + sous + '\'' +
                ", prise=" + prise +
                ", startTime=" + startTime +
                ", deliveryTime=" + deliveryTime +
                ", customers=" + customers +
                ", couriers=" + couriers +
                ", deliveryStatus=" + deliveryStatus +
                '}';
    }
}
