package com.backend.controller;

import com.backend.model.Consignment;
import com.backend.model.Product;
import com.backend.service.IConsignmentService;
import com.backend.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/home")
public class ConsignmentRestController {
    @Autowired
    private IConsignmentService iConsignmentService;
    @Autowired
    private IProductService iProductService;

    @GetMapping("/consignment-list")
    private ResponseEntity<List<Consignment>> getAllConsignment() {
        List<Consignment> consignmentList = this.iConsignmentService.display();
        if (consignmentList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(consignmentList, HttpStatus.OK);
    }

    @GetMapping("/product-list")
    private ResponseEntity<List<Product>> getAllProduct() {
        List<Product> productList = this.iProductService.displayProduct();
        if (productList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }
}
