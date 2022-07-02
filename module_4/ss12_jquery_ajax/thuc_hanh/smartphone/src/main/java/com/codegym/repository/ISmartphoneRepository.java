package com.codegym.repository;

import com.codegym.model.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISmartphoneRepository extends JpaRepository<Smartphone, Long> {

    @Query(value =" select * from smartphones", nativeQuery= true)
    List<Smartphone> displayAll();
}
