package com.example.demo.repository;

import com.example.demo.model.product.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductTypeRepository  extends JpaRepository<ProductType, Integer> {
}
