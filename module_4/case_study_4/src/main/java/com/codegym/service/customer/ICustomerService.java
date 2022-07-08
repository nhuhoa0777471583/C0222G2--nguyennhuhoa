package com.codegym.service.customer;

import com.codegym.model.customers.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {

    Page<Customer> displayAllAndDisplayByNameSearch(String nameSearch,Pageable pageable);
    void save(Customer customer);

    Customer displayAllById(Integer id);

    void delete(Integer id);
    List<Customer> findAll();
}
