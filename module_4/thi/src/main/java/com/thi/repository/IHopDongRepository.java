package com.thi.repository;

import com.thi.model.HopDong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHopDongRepository extends JpaRepository<HopDong,Integer> {
}
