package com.backend.service;

import com.backend.model.Consignment;
import com.backend.repository.IConsignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsignmentService implements IConsignmentService {
    @Autowired
    private IConsignmentRepository iConsignmentRepository;

    @Override
    public Page<Consignment> getAllAndSearchName(String nameSearch, Pageable pageable) {
        return null;
    }

    @Override
    public List<Consignment> display() {
        return this.iConsignmentRepository.findAll();
    }
}
