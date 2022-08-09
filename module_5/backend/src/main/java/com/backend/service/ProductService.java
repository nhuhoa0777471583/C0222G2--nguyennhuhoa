package com.backend.service;

import com.backend.model.Product;
import com.backend.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public List<Product> displayProduct() {
        return this.iProductRepository.findAll();
    }

    @Override
    public Product findById(Integer id) {
        return this.iProductRepository.findById(id).orElse(null);
    }
}
