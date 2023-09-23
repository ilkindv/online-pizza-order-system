package enums;

import java.time.LocalDate;
import java.time.LocalDateTime;

public enum StatusEnum {
    REGISTER_SUCCESSFULLY("Successfully registered!", LocalDateTime.now());

    private final String message;
    private final LocalDateTime statusTime;
    StatusEnum(String status,LocalDateTime statusTime){
        this.message = status;
        this.statusTime = statusTime;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getStatusTime() {
        return statusTime;
    }
}
