package com.example.demo.service.product;

import com.example.demo.dto.ErrorDTO;
import com.example.demo.dto.PaymentDto;
import com.example.demo.model.Cart;
import com.example.demo.model.Customer;

import java.util.List;

public interface ICartService {
    ErrorDTO saveCart(Cart cart);

    PaymentDto goPayment(Customer customer);


    Boolean minusQuantity(Cart productOrder);

    List<Cart> displayProductInCart(Customer customer);
}
