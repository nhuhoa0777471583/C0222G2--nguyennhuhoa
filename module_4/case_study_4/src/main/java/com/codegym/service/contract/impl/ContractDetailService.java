package com.codegym.service.contract.impl;

import com.codegym.model.contract.ContractDetail;
import com.codegym.repository.contract.IConTractDetailRepository;
import com.codegym.service.contract.IContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContractDetailService implements IContractDetailService {
    @Autowired
    private IConTractDetailRepository iConTractDetailRepository;
    @Override
    public List<ContractDetail> displayAll() {
        return this.iConTractDetailRepository.findAll();
    }
}
