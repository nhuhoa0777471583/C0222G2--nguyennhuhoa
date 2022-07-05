package com.codegym.service.customer;

import com.codegym.model.customers.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService {

    Page<Customer> displayCustomer(String name,Pageable pageable);
    void create(Customer customer);

}
