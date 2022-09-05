package com.example.demo.controller;


import com.example.demo.model.product.OrderProduct;
import com.example.demo.model.product.Product;
import com.example.demo.model.product.ProductType;
import com.example.demo.model.product.RentType;
import com.example.demo.repository.IOrderRepository;
import com.example.demo.repository.IProductTypeRepository;
import com.example.demo.repository.IRentTypeRepository;
import com.example.demo.service.IProductService;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/product/")
public class ProductRestController {

    @Autowired
    private IProductService iProductService;

    @Autowired
    private IOrderRepository iOrderRepository;

    @Autowired
    private IRentTypeRepository iRentTypeRepository;
    @Autowired
    private IProductTypeRepository iProductTypeRepository;
    @GetMapping("list")
    private ResponseEntity<List<Product>> findAll() {
        List<Product> productList = this.iProductService.productList();
        if (productList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @PostMapping("save")
    private ResponseEntity<Void> save(@RequestBody Product product) {
        this.iProductService.save(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    private ResponseEntity<Void> delete(@PathVariable Integer id) {
        Optional<Product> product = this.iProductService.findById(id);
        if (product == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        this.iProductService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("order")
    private ResponseEntity<List<OrderProduct>> findAllOrder() {
        List<OrderProduct> orderProducts = this.iOrderRepository.getAllOrder();
        if (orderProducts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(orderProducts, HttpStatus.OK);
    }

    @GetMapping("rent-type")
    private ResponseEntity<List<RentType>> findAllRentType() {
        List<RentType> rentTypes = this.iRentTypeRepository.findAll();
        if (rentTypes.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(rentTypes, HttpStatus.OK);
    }

    @GetMapping("product-type")
    private ResponseEntity<List<ProductType>> findAllProductType() {
        List<ProductType> productTypes = this.iProductTypeRepository.findAll();
        if (productTypes.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productTypes, HttpStatus.OK);
    }

}
