package service.customer;

import model.Customer;
import model.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> getAllCustomerType();
    void save(CustomerType customerType);
}
