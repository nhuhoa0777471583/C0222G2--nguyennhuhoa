package com.backend.controller;

import com.backend.model.Consignment;
import com.backend.model.Product;
import com.backend.service.IConsignmentService;
import com.backend.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/home/consignment")
public class ConsignmentRestController {
    @Autowired
    private IConsignmentService iConsignmentService;

//    @GetMapping("/")
//    private ResponseEntity<List<Consignment>> getAllConsignment() {
//        List<Consignment> consignmentList = this.iConsignmentService.display();
//        if (consignmentList.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<>(consignmentList, HttpStatus.OK);
//    }

    @GetMapping("/")
    private ResponseEntity<Page<Consignment>> getAll(@PageableDefault(value = 5) Pageable pageable) {
        Page<Consignment> consignmentPage = this.iConsignmentService.getAllByPage(pageable);
        return new ResponseEntity<>(consignmentPage, HttpStatus.OK);
    }

    @GetMapping("/{nameSearch}")
    private ResponseEntity<Page<Consignment>> displayByName(@PageableDefault(value = 4) Pageable pageable,
                                                            @PathVariable("nameSearch") String nameSearch) {
        Page<Consignment> consignmentPage = this.iConsignmentService.displayByName(nameSearch, pageable);
        return new ResponseEntity<>(consignmentPage, HttpStatus.OK);
    }

    @DeleteMapping("/{idDelete}")
    private ResponseEntity<Consignment> delete(@PathVariable("idDelete") Integer idDelete) {
        this.iConsignmentService.deleteById(idDelete);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/")
    private ResponseEntity<Consignment> add(@RequestBody Consignment consignment) {
        this.iConsignmentService.save(consignment);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    private ResponseEntity<Consignment> findById(@PathVariable("id") Integer id) {
        Consignment consignment = this.iConsignmentService.findById(id);
        if (consignment.getId() == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(consignment, HttpStatus.OK);
    }


}
