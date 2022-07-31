package com.backend.service;

import com.backend.model.Consignment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IConsignmentService {


    Page<Consignment> displayByName(String nameSearch, Pageable pageable);

    Page<Consignment> getAllByPage(Pageable pageable);

    void deleteById(Integer idDelete);

    void save(Consignment consignment);

    Consignment findById(Integer id);

}
