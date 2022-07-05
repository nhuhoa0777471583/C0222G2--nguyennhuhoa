package com.codegym.repository.facility;

import com.codegym.model.facility.RentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRenTypeRepository extends JpaRepository<RentType, Integer> {

    @Query(value = " select * from rent_type", nativeQuery = true)
    List<RentType> displayAllRentType();
}
