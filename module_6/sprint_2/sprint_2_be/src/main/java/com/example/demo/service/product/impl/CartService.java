package com.example.demo.service.product.impl;

import com.example.demo.dto.ErrorDTO;
import com.example.demo.dto.ICartDto;
import com.example.demo.model.Cart;
import com.example.demo.repository.ICartRepository;
import com.example.demo.service.product.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService implements ICartService {
    @Autowired
    private ICartRepository iCartRepository;

    @Override
    public ErrorDTO saveCart(Cart cart) {
        ErrorDTO errorDto = new ErrorDTO();
        cart.setIsDelete(false);
        Cart c = this.iCartRepository.findProductOrderListByCustomerAndProduct(cart);
        if (c == null) {
            if (cart.getQuantity() > cart.getProduct().getCost()) {
                errorDto.setMessage("quantity");
                errorDto.setCart(c);
                return errorDto;
            } else {
                this.iCartRepository.save(cart);
            }
        }else {
            if ((c.getQuantity() + cart.getQuantity()) > cart.getProduct().getCost()) {
                errorDto.setMessage("quantity");
                errorDto.setCart(c);
                return errorDto;
            } else {
                c.setQuantity(cart.getQuantity() + c.getQuantity());
                this.iCartRepository.save(c);
            }
        }
        return errorDto;
    }
}
