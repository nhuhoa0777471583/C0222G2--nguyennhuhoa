package com.example.demo.service.product;

import com.example.demo.model.Customer;

public interface ICustomerService {

    Customer getCustomerByUserName(String userName);
}
