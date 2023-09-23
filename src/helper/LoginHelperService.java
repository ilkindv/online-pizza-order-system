package helper;

import data.GlobalData;
import enums.ExceptionEnum;
import exception.ApplicationException;
import model.Customer;
import service.AdminManagementService;
import service.CustomerLoginManagementService;
import service.CustomerManagementService;
import service.impl.AdminManagementServiceImpl;
import service.impl.CustomerLoginManagementServiceImpl;
import service.impl.CustomerManagementServiceImpl;
import util.InputUtil;

public class LoginHelperService {
    private static LoginHelperService instance;
    byte loginCount;

    private LoginHelperService(){}

    public static LoginHelperService getInstance(){
        return instance == null ? new LoginHelperService() : instance;
    }

    public void login(){
        boolean isTrue = false;
        while (true) {

            String mailAddress = InputUtil.getInstance().inputString("Enter your email: ");
            String password = InputUtil.getInstance().inputString("Enter your password: ");
            if (mailAddress.equals("admin") && password.equals("admin123")) {
                AdminManagementService adminManagementSystem = new AdminManagementServiceImpl();
                adminManagementSystem.manage();
            }
            for (Customer customer : GlobalData.customers) {
                if (customer.getEmailAddress().equals(mailAddress) && customer.getPassword().equals(password)) {
                    CustomerLoginManagementService customerloginManagementService = new CustomerLoginManagementServiceImpl();
                    customerloginManagementService.manage(customer);
                    isTrue= true;
                }
            }

            if (!isTrue) {
                throw new ApplicationException(ExceptionEnum.WRONG_INFORMATION);
            }

            if (loginCount > 3){
                System.out.println("Too many unsuccessful login attempts. Exiting.");
                System.exit(-1);
            }
            ++loginCount;
        }
    }
}
