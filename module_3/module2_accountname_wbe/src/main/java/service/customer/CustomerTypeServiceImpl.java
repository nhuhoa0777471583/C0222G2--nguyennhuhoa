package service.customer;

import model.customer.CustomerType;
import repository.customer.CustomerTypeRepositoryImpl;
import repository.customer.ICustomerTypeRepository;

import java.util.List;

public class CustomerTypeServiceImpl implements ICustomerTypeService {
    private ICustomerTypeRepository iCustomerTypeRepository = new CustomerTypeRepositoryImpl();
    @Override
    public List<CustomerType> getAllCustomerType() {
        return iCustomerTypeRepository.getAllCustomerType();
    }

}
