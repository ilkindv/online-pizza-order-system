package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Customer {
    private long customerId;
    private long orderId;
    private String customerName;
    private String customerSurname;
    private String phoneNumber;
    private String emailAddress;
    private String password;
    private BigDecimal moneyAccount;
    private LocalDate registrationDate;
    private boolean status;

    public Customer(long customerId,String customerName, String customerSurname, String phoneNumber, String emailAddress,
                    String password ,LocalDate registrationDate) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.password = password;
        this.moneyAccount = new BigDecimal(1000);
        this.registrationDate = registrationDate;
    }
    public Customer(){};

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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getMoneyAccount() {
        return moneyAccount;
    }

    public void setMoneyAccount(BigDecimal moneyAccount) {
        this.moneyAccount = moneyAccount;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", customerSurname='" + customerSurname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", moneyAccount=" + moneyAccount +
                ", registrationDate=" + registrationDate +
                ", status=" + status +
                '}';
    }
}
