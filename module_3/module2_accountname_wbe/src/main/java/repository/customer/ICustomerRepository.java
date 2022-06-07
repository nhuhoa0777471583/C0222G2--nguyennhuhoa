package repository.customer;

import model.customer.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> getAll();
    void save(Customer customer);

    void remove(Integer id);

    void edit (Customer customer);

    Customer findById(Integer id);
}
