package service.customer;

import model.Customer;
import repository.customer.CustomerRepositoryImpl;
import repository.customer.ICustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    private ICustomerRepository iCustomer = new CustomerRepositoryImpl();

    @Override
    public List<Customer> getAll() {
        return iCustomer.getAll();
    }

    @Override
    public void save(Customer customer) {
        this.iCustomer.save(customer);
    }
}
