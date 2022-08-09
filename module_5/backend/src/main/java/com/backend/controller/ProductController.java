package com.backend.controller;


import com.backend.model.Product;
import com.backend.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/home/product")
public class ProductController {
    @Autowired
    private IProductService iProductService;
    @GetMapping("/")
    private ResponseEntity<List<Product>> getAllProduct() {
        List<Product> productList = this.iProductService.displayProduct();
        if (productList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    private ResponseEntity<Product> getIdProduct(@PathVariable("id") Integer id){
       Product product = this.iProductService.findById(id);
       if(product == null){
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
}
