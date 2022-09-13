package com.example.demo.service.product;

import com.example.demo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService {
    Page<Product> searchPriceAndNameLaptop(Pageable pageable,String nameProduct, String beforePrice, String firstPrice);

    Page<Product> searchPriceAndNamePhone(Pageable pageable, String nameProduct, String beforePrice, String firstPrice);

}
