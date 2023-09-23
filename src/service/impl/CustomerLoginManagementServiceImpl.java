package service.impl;

import enums.ExceptionEnum;
import exception.ApplicationException;
import model.Customer;
import service.CustomerLoginManagementService;
import service.CustomerService;
import service.ManagementService;
import util.MenuUtil;

public class CustomerLoginManagementServiceImpl implements CustomerLoginManagementService {
    @Override
    public void manage(Customer customer) {
        CustomerService customerService = new CustomerServiceImpl();
        ManagementService managementService = new ManagementServiceImpl();
        while (true) {
            try {
                int option = MenuUtil.getInstance().customerMenu();
                switch (option) {
                    case 0:
                        System.exit(-1);
                    case 1:
                        managementService.manage();
                        break;
                    case 2:
                        customerService.placeOrder(customer);
                        break;
                    case 3:
                        customerService.trackOrder();
                        break;
                    case 4:
                        customerService.trackOrder();
                        break;
                    case 5:
                        customerService.cancelOrder();
                        break;
                    default:
                        throw new ApplicationException(ExceptionEnum.INVALID_OPTION_EXCEPTION);
                }
            } catch (ApplicationException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
