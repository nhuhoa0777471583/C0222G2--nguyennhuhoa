package com.codegym.service.contract;

import com.codegym.model.contract.ContractDetail;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IContractDetailService {

    List<ContractDetail> displayAll();

}
