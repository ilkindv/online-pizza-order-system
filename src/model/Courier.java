package model;

public class Courier {
    private long courierId;
    private long customerId;
    private long orderId;
    private String courierName;
    private String phoneNumber;
    private String vehicleType;
    private String vehiclePlate;
    private boolean availabilityStatus;

    public Courier(long courierId,String courierName,
                   String phoneNumber, String vehicleType, String vehiclePlate) {
        this.courierId = courierId;
        this.courierName = courierName;
        this.phoneNumber = phoneNumber;
        this.vehicleType = vehicleType;
        this.vehiclePlate = vehiclePlate;
    }

    public long getCourierId() {
        return courierId;
    }

    public void setCourierId(long courierId) {
        this.courierId = courierId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getCourierName() {
        return courierName;
    }

    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehiclePlate() {
        return vehiclePlate;
    }

    public void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }

    public boolean isAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "courierId=" + courierId +
                ", customerId=" + customerId +
                ", orderId=" + orderId +
                ", courierName='" + courierName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", vehiclePlate='" + vehiclePlate + '\'' +
                ", availabilityStatus=" + availabilityStatus +
                '}';
    }
}
