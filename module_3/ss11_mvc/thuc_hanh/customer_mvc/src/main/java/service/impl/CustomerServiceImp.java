package service.impl;

import model.Customer;
import service.ICustomerService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImp implements ICustomerService {
    private static Map<Integer, Customer> customerMap = new HashMap<>();

    static {
        customerMap.put(1, new Customer(1, "hoa1", "hoa23@gmail.com", "da nang"));
        customerMap.put(2, new Customer(2, "hoa2", "hoa23@gmail.com", "ha noi"));
        customerMap.put(3, new Customer(3, "hoa3", "hoa23@gmail.com", "quang tri"));
        customerMap.put(4, new Customer(4, "hoa4", "hoa23@gmail.com", "hue"));
        customerMap.put(5, new Customer(5, "hoa5", "hoa23@gmail.com", "sai gon"));
    }


    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public void save(Customer customer) {
        customerMap.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customerMap.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customerMap.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customerMap.remove(id);
    }
}
