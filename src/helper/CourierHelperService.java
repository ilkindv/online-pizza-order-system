package helper;

import model.Courier;
import util.InputUtil;

public class CourierHelperService {
    private static long CourierId;
    private static CourierHelperService instance;

    private CourierHelperService(){}

    public static CourierHelperService getInstance(){
        return instance == null ? new CourierHelperService() : instance;
    }

    public Courier fillCourier() {
        try {
            String name = InputUtil.getInstance().inputString("Enter the courier name: ");
            String phoneNumber = InputUtil.getInstance().inputString("Enter the phone number: ");
            String vehicleType = InputUtil.getInstance().inputString("Enter the vehicle type: ");
            String vehiclePlate = InputUtil.getInstance().inputString("Enter the vehicle plate:");
            return new Courier(++CourierId, name, phoneNumber, vehicleType, vehiclePlate);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
