package com.thi.repository;

import com.thi.model.PhongTro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPhongTroRepository extends JpaRepository<PhongTro, Integer> {
}
