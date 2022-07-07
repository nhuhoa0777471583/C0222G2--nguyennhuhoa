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
    public Page<Customer> findAll(Pageable pageable) {
        return iCustomersRepository.findAll(pageable);
    }

    @Override
    public void save(Customer customer) {
        iCustomersRepository.save(customer);
    }

    @Override
    public Customer displayAllById(Integer id) {
        return iCustomersRepository.displayAllById(id);
    }

    @Override
    public void delete(Integer id) {
        this.iCustomersRepository.deleteById(id);
    }
}
