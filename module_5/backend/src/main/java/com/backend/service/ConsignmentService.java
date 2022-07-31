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
    public Page<Consignment> displayByName(String nameSearch, Pageable pageable) {
        return this.iConsignmentRepository.getAllAndSearchNameProduct(nameSearch, pageable);
    }

    @Override
    public Page<Consignment> getAllByPage(Pageable pageable) {
        return this.iConsignmentRepository.findAll(pageable);
    }

    @Override
    public void deleteById(Integer idDelete) {
        this.iConsignmentRepository.deleteById(idDelete);
    }

    @Override
    public void save(Consignment consignment) {
        this.iConsignmentRepository.save(consignment);
    }

    @Override
    public Consignment findById(Integer id) {
      return this.iConsignmentRepository.findById(id).orElse(null);
    }
}
