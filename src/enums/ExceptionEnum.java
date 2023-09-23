package enums;

import java.time.LocalDateTime;

public enum ExceptionEnum {
    CUSTOMER_NOT_FOUND_EXCEPTION("Customer not found!", LocalDateTime.now()),
    CUSTOMERS_IS_NOT_LOGGED_IN_YET("Customer is not logged in yet!", LocalDateTime.now()),
    COURIERS_IS_NOT_LOGGED_IN_YET("Customer is not logged in yet!", LocalDateTime.now()),
    INVALID_OPTION_EXCEPTION("Invalid option!", LocalDateTime.now()),
    NOT_REGISTERED("Not registered!", LocalDateTime.now()),
    THERE_ARE_NO_ORDERS_YET("There are no orders yet!", LocalDateTime.now()),
    WRONG_INFORMATION("Wrong information!", LocalDateTime.now()),
    INCORRECT_EMAIL("Please enter correct email!",LocalDateTime.now()),
    INCORRECT_PASSWORD("Please enter the 8-character password!",LocalDateTime.now()),
    SAME_EMAIL_EXCEPTION("Same email",LocalDateTime.now());
    private final String message;
    private final LocalDateTime exceptionTime;

    ExceptionEnum(String message, LocalDateTime exceptionTime) {
        this.message = message;
        this.exceptionTime = exceptionTime;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getExceptionTime() {
        return exceptionTime;
    }
}
