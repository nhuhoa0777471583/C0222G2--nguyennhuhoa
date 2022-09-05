package com.example.demo.service;

import com.example.demo.model.product.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    void save(Product product);

    List<Product> productList();

    void deleteProduct(Integer id);

    Optional<Product> findById(Integer id);
}
