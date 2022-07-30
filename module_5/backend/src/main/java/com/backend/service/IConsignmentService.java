package com.backend.service;

import com.backend.model.Consignment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IConsignmentService {
    Page<Consignment> getAllAndSearchName(String nameSearch, Pageable pageable);

    List<Consignment> display();
}
