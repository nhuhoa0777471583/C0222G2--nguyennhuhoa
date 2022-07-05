package com.codegym.service.facility;

import com.codegym.model.facility.Facility;
import com.codegym.model.facility.FacilityType;
import com.codegym.model.facility.RentType;
import com.codegym.repository.facility.IFacilityRepository;
import com.codegym.repository.facility.IFacilityTypeRepository;
import com.codegym.repository.facility.IRenTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityService implements IFacilityService {
    @Autowired
    private IFacilityRepository iFacilityRepository;

    @Autowired
    private IFacilityTypeRepository iFacilityTypeRepository;

    @Autowired
    private IRenTypeRepository iRenTypeRepository;

    @Override
    public List<FacilityType> displayAllFacilityType() {
        return this.iFacilityTypeRepository.displayAllFacilityType();
    }

    @Override
    public List<RentType> displayAllRentType() {
        return this.iRenTypeRepository.displayAllRentType();
    }


    @Override
    public Page<Facility> displayAll( Pageable pageable) {
        return iFacilityRepository.displayAll( pageable);

    }

    @Override
    public void save(Facility facility) {
        this.iFacilityRepository.save(facility);
    }

    @Override
    public Facility displayById(Integer id) {
        return this.iFacilityRepository.displayById(id);
    }

    @Override
    public List<Facility> displayAll() {
        return this.iFacilityRepository.displayAll();
    }
}
