package service.impl;

import enums.ExceptionEnum;
import exception.ApplicationException;
import model.Customer;
import service.AdminService;
import service.CustomerLoginManagementService;
import service.CustomerService;
import service.ManagementService;
import util.MenuUtil;

public class ManagementServiceImpl implements ManagementService {
    @Override
    public void manage(Customer customer) {
        AdminService adminService = new AdminServiceImpl();
        CustomerLoginManagementService customerLoginManagementService  = new CustomerLoginManagementServiceImpl();
        while(true){
            try {
                int option = MenuUtil.getInstance().entryMenu();
                switch (option){
                    case 0:
                        System.exit(-1);
                    case 1:
                        adminService.login();
                        break;
                    case 2:
                        customerLoginManagementService.manage(customer);
                        break;
                    default:
                        throw new ApplicationException(ExceptionEnum.INVALID_OPTION_EXCEPTION);
                }
            }catch (ApplicationException exception){
                System.out.println(exception.getMessage());
            }
        }

    }
}
