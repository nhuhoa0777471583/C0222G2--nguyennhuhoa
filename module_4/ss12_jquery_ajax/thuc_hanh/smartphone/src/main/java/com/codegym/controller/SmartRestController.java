package com.codegym.controller;

import com.codegym.model.Smartphone;
import com.codegym.service.ISmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/phone")
@CrossOrigin
public class SmartRestController {
    @Autowired
    private ISmartphoneService smartphoneService;

    @PostMapping
    public ResponseEntity<Smartphone> createSmartphone(@RequestBody Smartphone smartphone) {
        return new ResponseEntity<>(smartphoneService.save(smartphone), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Smartphone>> allPhones() {
        List<Smartphone> smartphoneList = this.smartphoneService.displayAll();
        if (smartphoneList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(smartphoneList, HttpStatus.OK);
    }


    @GetMapping("edit/{id}")
    public ResponseEntity<Smartphone> editSmartphone(@PathVariable Long id, @RequestBody Smartphone smartphone) {
        Optional<Smartphone> smartphoneOptional = smartphoneService.findById(id);
        if (!smartphoneOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(smartphoneService.save(smartphone), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Smartphone> update(@RequestBody Smartphone smartphone){
        smartphoneService.save(smartphone);
        return  new ResponseEntity<>(smartphone,HttpStatus.OK);
    }


}
