package com.backend.repository;

import com.backend.model.Consignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConsignmentRepository extends JpaRepository<Consignment, Integer> {


}
