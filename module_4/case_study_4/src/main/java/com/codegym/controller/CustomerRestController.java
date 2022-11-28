package com.codegym.controller;


import com.codegym.model.customers.Customer;
import com.codegym.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin(origins = "*" )
@RequestMapping("/customer")
public class CustomerRestController {
    @Autowired
    private ICustomerService iCustomerService;


    @GetMapping("/list")
    private ResponseEntity<List<Customer>> displayAllCustomer() {
        List<Customer> customerList = this.iCustomerService.findAll();
        if (customerList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(customerList, HttpStatus.OK);
    }
}
