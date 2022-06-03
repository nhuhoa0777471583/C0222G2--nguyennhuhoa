package repository.customer;

import model.Customer;
import model.CustomerType;

import java.util.List;

public interface ICustomerTypeRepository {
    List<CustomerType> getAllCutomerType();
    void save(CustomerType customerType);
}
