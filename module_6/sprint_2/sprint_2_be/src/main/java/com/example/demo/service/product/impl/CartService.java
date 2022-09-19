package com.example.demo.service.product.impl;

import com.example.demo.dto.ErrorDTO;
import com.example.demo.dto.PaymentDto;
import com.example.demo.model.Cart;
import com.example.demo.model.Customer;
import com.example.demo.model.Product;
import com.example.demo.repository.ICartRepository;
import com.example.demo.repository.IProductRepository;
import com.example.demo.service.product.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CartService implements ICartService {
    @Autowired
    private ICartRepository iCartRepository;
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public ErrorDTO saveCart(Cart cart) {
        ErrorDTO errorDto = new ErrorDTO();
        cart.setIsDelete(false);
        Cart orderProduct = this.iCartRepository.findProductOrderListByCustomerAndProduct(cart);
        if (orderProduct == null) {
            if (cart.getQuantity() > cart.getProduct().getQuantity()) {
                errorDto.setMessage("quantity");
                errorDto.setCart(orderProduct);
                return errorDto;
            } else {
                this.iCartRepository.save(cart);
            }
        } else {
            if ((orderProduct.getQuantity() + cart.getQuantity()) > cart.getProduct().getQuantity()) {
                errorDto.setMessage("quantity");
                errorDto.setCart(orderProduct);
                return errorDto;
            } else {
                orderProduct.setQuantity(cart.getQuantity() + orderProduct.getQuantity());
                this.iCartRepository.save(orderProduct);
            }
        }
        return errorDto;
    }

    @Transactional
    @Override
    public PaymentDto goPayment(Customer customer) {
        List<Cart> carts = this.iCartRepository.displayProductInCart(customer);
        PaymentDto paymentDto = new PaymentDto();
        paymentDto.setCartList(carts);
        paymentDto.setCustomer(customer);
        for (Cart ca : carts) {
            this.iProductRepository.updateQuantity(ca.getQuantity(), ca.getProduct().getId());
            Product product = this.iProductRepository.getById(ca.getProduct().getId());
            if (product.getQuantity() <= 1) {
                this.iProductRepository.updateIsDeleted(product.getId());
            }
        }
        return paymentDto;
    }

    @Override
    public Boolean minusQuantity(Cart productOrder) {
        if (productOrder.getQuantity() > 1) {
            productOrder.setQuantity(productOrder.getQuantity() - 1);
            this.iCartRepository.save(productOrder);
            return true;
        }
        return false;
    }

    @Override
    public List<Cart> displayProductInCart(Customer customer) {
        return this.iCartRepository.displayProductInCart(customer);
    }

}
