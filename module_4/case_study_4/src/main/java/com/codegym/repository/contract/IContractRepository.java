package com.codegym.repository.contract;

import com.codegym.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IContractRepository extends JpaRepository<Contract, Integer> {

    @Query(value = " select * from contract where deposit like :key",
            countQuery = "select count(*) from ( select * from contract where deposit like :key ) temp",
            nativeQuery = true)
    Page<Contract> findAllByDepositContaining(@Param("key") String nameSearch, Pageable pageable);
}
