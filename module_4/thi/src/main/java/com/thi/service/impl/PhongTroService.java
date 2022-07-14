package com.thi.service.impl;

import com.thi.model.PhongTro;
import com.thi.repository.IPhongTroRepository;
import com.thi.service.IPhongTroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhongTroService implements IPhongTroService {
    @Autowired
    private IPhongTroRepository iPhongTroRepository;

    @Override
    public List<PhongTro> findAll() {
        return this.iPhongTroRepository.findAll();
    }
}
