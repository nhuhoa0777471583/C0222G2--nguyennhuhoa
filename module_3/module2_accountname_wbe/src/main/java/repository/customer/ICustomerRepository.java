package repository.customer;

import model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> getAll();
    void save(Customer customer);
}
