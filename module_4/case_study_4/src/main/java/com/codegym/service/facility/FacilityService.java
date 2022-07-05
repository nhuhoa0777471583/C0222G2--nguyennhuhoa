package com.codegym.service.facility;

import com.codegym.model.facility.Facility;
import com.codegym.repository.facility.IFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FacilityService implements IFacilityService {
    @Autowired
    private IFacilityRepository iFacilityRepository;

    @Override
    public Page<Facility> displayAll(String name, Pageable pageable) {
        return iFacilityRepository.findAllByNameContaining(name, pageable);

    }
}
