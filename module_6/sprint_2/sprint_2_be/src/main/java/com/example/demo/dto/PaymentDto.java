package com.example.demo.dto;

import com.example.demo.model.Cart;
import com.example.demo.model.Customer;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class PaymentDto {
    private List<Cart> cartList;
    private Customer customer;
}
