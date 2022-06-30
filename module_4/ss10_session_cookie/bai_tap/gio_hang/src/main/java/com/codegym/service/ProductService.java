package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductRepository iProductRepository;


    @Override
    public List<Product> displayAll() {
        return this.iProductRepository.displayAll();
    }

    @Override
    public Optional<Product> displayById(Integer id) {
        return this.iProductRepository.displayById(id);
    }
}
