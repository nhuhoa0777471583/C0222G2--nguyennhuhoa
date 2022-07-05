package com.codegym.service.customer.impl;

import com.codegym.model.customers.Customer;
import com.codegym.repository.customer.ICustomersRepository;
import com.codegym.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerSevice implements ICustomerService {
@Autowired
private ICustomersRepository iCustomersRepository;

    @Override
    public Page<Customer> displayCustomer(String name, Pageable pageable) {
        return iCustomersRepository.findAllByNameContaining(name,pageable);
    }

    @Override
    public void create(Customer customer) {

    }
}
