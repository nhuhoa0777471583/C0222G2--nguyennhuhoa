package service.customer;

import model.customer.Customer;
import repository.customer.CustomerRepositoryImpl;
import repository.customer.ICustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    private ICustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public List<Customer> getAll() {
        return customerRepository.getAll();
    }

    @Override
    public void save(Customer customer) {
        this.customerRepository.save(customer);
    }


    @Override
    public void remove(Integer id) {
        this.customerRepository.remove(id);
    }

    @Override
    public void edit(Customer customer) {
        this.customerRepository.edit(customer);
    }

    @Override
    public Customer findById(Integer id) {
        return customerRepository.findById(id);
    }

}
