package service.customer;

import model.customer.Customer;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface ICustomerService {
    List<Customer> getAll();
    void save(Customer customer);


    void delete(Integer id) ;

    void edit(Customer customer);

    Customer findById(Integer id);

    List<Customer> searchByName(String nameSearch);

    Map<String,String> validateCreate(Customer customere);

    Map<String,String> validateEdit(Customer customere);
}
