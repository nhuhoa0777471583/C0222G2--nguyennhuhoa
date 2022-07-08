package com.codegym.service.contract;

import com.codegym.model.contract.AttachFacility;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IAttachFacilityService {

    List<AttachFacility> displayAll();
}
