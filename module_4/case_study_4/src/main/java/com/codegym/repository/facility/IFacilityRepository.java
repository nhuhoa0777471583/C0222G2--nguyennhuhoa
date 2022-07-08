package com.codegym.repository.facility;

import com.codegym.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFacilityRepository extends JpaRepository<Facility, Integer> {


//    Page<Facility> findAll(Pageable pageable);

    @Query(value =" select * from facility where name_facility like :key",
            countQuery = " select count(*) from ( select * from facility where name_facility like :key) temp_table ",
            nativeQuery = true)
    Page<Facility> displayAll(@Param("key")String nameSearch,Pageable pageable);

    @Query(value = "select * from facility where id = :id", nativeQuery = true)
    Facility displayById(@Param("id") Integer id);

//    @Query(value ="select * from facility", nativeQuery = true)
//    List<Facility> displayAll();

}
