package service.customer;

import model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAll();
    void save(Customer customer);
}
