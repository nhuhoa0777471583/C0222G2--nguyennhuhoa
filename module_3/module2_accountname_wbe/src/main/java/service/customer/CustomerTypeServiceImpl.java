package service.customer;

import model.Customer;
import model.CustomerType;
import repository.customer.CustomerTypeRepositoryImpl;
import repository.customer.ICustomerTypeRepository;

import java.util.List;

public class CustomerTypeServiceImpl implements ICustomerTypeService {
    private ICustomerTypeRepository iCustomerTypeRepository = new CustomerTypeRepositoryImpl();
    @Override
    public List<CustomerType> getAllCustomerType() {
        return iCustomerTypeRepository.getAllCutomerType();
    }

    @Override
    public void save(CustomerType customerType) {
    this.iCustomerTypeRepository.save(customerType);
    }
}
