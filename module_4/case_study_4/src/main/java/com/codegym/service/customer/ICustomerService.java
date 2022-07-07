package com.codegym.service.customer;

import com.codegym.model.customers.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService {

    Page<Customer> findAll(Pageable pageable);
    void save(Customer customer);

    Customer displayAllById(Integer id);

    void delete(Integer id);
}
