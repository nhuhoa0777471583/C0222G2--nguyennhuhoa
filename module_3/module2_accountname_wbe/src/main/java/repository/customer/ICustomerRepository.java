package repository.customer;

import model.customer.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerRepository {
    List<Customer> getAll();
    void save(Customer customer);

    void delete(Integer id);

    void edit (Customer customer);

    Customer findById(Integer id);

    List<Customer> searchByName(String nameSearch);
}
