package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    private static Map<Integer, Product> products = new HashMap<>();

    static {
        products.put(1, new Product(1, "banh", 10.000, "ngon", "Viet Nam"));
        products.put(2, new Product(2, "keo", 5.000, "ngon", "Viet Nam"));
        products.put(3, new Product(3, "sua", 15.000, "ngon", "Viet Nam"));
        products.put(4, new Product(4, "coca", 15.000, "ngon", "Trung Quoc"));
        products.put(5, new Product(5, "bia", 15.000, "ngon", "Viet Nam"));
    }


    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(Integer id) {
        return products.get(id);
    }

    @Override
    public void update(Integer id, Product product) {
        products.put(id, product);
    }

    @Override
    public void delete(Integer id) {
        products.remove(id);
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> productList = new ArrayList<>();
        for (Map.Entry<Integer, Product> pro : products.entrySet()){
            if(pro.getValue().getNameProduct().contains(name)){
                productList.add(pro.getValue());
            }
        }
        return productList;
    }
}
