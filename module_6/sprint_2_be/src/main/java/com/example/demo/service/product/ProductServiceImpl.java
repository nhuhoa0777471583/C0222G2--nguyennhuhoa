package com.example.demo.service.product;

import com.example.demo.model.Product;
import com.example.demo.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public Page<Product> searchPriceAndNameLaptop(Pageable pageable, String nameProduct, String beforePrice, String firstPrice) {
        Double before = Double.valueOf(beforePrice);
        Double first = Double.valueOf(firstPrice);
        return this.iProductRepository.searchPriceAndNameLaptop(pageable, "%" + nameProduct + "%", before, first);
    }

    @Override
    public Page<Product> searchPriceAndNamePhone(Pageable pageable, String nameProduct, String beforePrice, String firstPrice) {
        Double before = Double.valueOf(beforePrice);
        Double first = Double.valueOf(firstPrice);
        return this.iProductRepository.searchPriceAndNamePhone(pageable, "%" + nameProduct + "%", before, first);
    }
}
