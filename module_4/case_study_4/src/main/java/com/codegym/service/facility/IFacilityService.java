package com.codegym.service.facility;

import com.codegym.model.facility.Facility;
import com.codegym.model.facility.FacilityType;
import com.codegym.model.facility.RentType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IFacilityService {
    List<FacilityType> displayAllFacilityType();
    List<RentType> displayAllRentType();

    Page<Facility> displayAllAndDisplayByName(String nameSearch,Pageable pageable);

    void save(Facility facility);

    Facility displayById(Integer id);


    void deleteById(Integer id);

    List<Facility> findAll();
}
