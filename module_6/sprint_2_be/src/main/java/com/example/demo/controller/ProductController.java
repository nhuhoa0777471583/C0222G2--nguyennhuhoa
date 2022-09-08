package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class ProductController {
    @Autowired
    private IProductRepository iProductRepository;

    @GetMapping("/product")
    public ResponseEntity<List<Product>> displayProduct() {
        List<Product> productList = this.iProductRepository.findAll();
        if (productList == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @GetMapping("/laptop")
    public ResponseEntity<List<Product>> displayLaptop() {
        List<Product> productList = this.iProductRepository.getLaptop();
        if (productList == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @GetMapping("/phone")
    public ResponseEntity<List<Product>> displayPhone() {
        List<Product> productList = this.iProductRepository.getPhone();
        if (productList == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @GetMapping("/near-day")
    public ResponseEntity<List<Product>> displayProductNearDay() {
        List<Product> products = this.iProductRepository.getProductNearTheDay();
        if (products == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Optional<Product>> displayProductById(@PathVariable Integer id) {
        Optional<Product> pr = this.iProductRepository.findById(id);
        if (pr == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(pr, HttpStatus.OK);
    }


}
