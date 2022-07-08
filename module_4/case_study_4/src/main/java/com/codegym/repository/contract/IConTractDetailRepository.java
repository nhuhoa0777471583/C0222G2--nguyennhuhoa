package com.codegym.repository.contract;

import com.codegym.model.contract.ContractDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConTractDetailRepository extends JpaRepository<ContractDetail, Integer> {
}
