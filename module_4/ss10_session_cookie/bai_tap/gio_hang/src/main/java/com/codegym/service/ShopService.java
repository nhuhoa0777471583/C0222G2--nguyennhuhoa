package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.repository.IShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService implements IShopService {

    @Autowired
    private IShopRepository iShopRepository;

    @Override
    public List<Product> displayAll() {
        return iShopRepository.displayAll();
    }
}
