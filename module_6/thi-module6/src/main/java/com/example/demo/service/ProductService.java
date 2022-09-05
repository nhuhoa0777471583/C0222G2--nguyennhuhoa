package com.example.demo.service;

import com.example.demo.model.product.Product;
import com.example.demo.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public void save(Product product) {
        this.iProductRepository.save(product);
    }

    @Override
    public List<Product> productList() {
        return this.iProductRepository.displayProduct();
    }

    @Override
    public void deleteProduct(Integer id) {
       this.iProductRepository.deleteProduct(id);
    }

    @Override
    public Optional<Product> findById(Integer id) {
        return this.iProductRepository.findById(id);
    }
}
