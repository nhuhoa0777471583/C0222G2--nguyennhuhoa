package com.example.demo.service.product;

import com.example.demo.dto.ErrorDTO;
import com.example.demo.model.Cart;

public interface ICartService {
    ErrorDTO saveCart(Cart cart);
}
