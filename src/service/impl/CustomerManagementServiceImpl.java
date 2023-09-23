package service.impl;

import enums.ExceptionEnum;
import exception.ApplicationException;
import model.Customer;
import model.Order;
import service.AdminService;
import service.CustomerManagementService;
import service.CustomerService;
import service.ManagementService;
import util.MenuUtil;

public class CustomerManagementServiceImpl implements CustomerManagementService {
    @Override
    public void manage() {
        CustomerService customerService = new CustomerServiceImpl();
        ManagementService managementService = new ManagementServiceImpl();
        while(true){
            try {
                int option = MenuUtil.getInstance().customerMenu();
                switch (option){
                    case 0:
                        System.exit(-1);
                    case 1:
                        customerService.login();
                    case 2:
                        customerService.register();
                    case 3:
                        managementService.manage();
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
