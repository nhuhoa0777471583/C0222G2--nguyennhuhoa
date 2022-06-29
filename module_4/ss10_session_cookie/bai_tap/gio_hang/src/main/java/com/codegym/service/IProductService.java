package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    Iterable<Product> displayAll();

    Optional<Product> displayById(Integer id);
}
