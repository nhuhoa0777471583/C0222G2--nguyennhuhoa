package com.codegym.repository.facility;


import com.codegym.model.facility.FacilityType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public interface IFacilityTypeRepository extends JpaRepository<FacilityType, Integer> {
    @Query(value = " select * from facility_type", nativeQuery = true)
    List<FacilityType> displayAllFacilityType();
}
