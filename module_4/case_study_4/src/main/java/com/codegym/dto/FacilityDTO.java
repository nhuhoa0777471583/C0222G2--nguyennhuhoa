package com.codegym.dto;

import com.codegym.model.contract.Contract;
import com.codegym.model.facility.FacilityType;
import com.codegym.model.facility.RentType;

import javax.validation.constraints.Pattern;
import java.util.List;

public class FacilityDTO {

    @Pattern(regexp = "^([A-Z][^A-Z\\s]+)(\\s[A-Z][^A-Z\\s]+)*$")
    private String nameFacility;
    private Integer area;
    private Double cost;
    private Integer maxPeople;
    private String standardRoom;
    private String descriptionOtherConvenience;
    private Double poolArea;
    private Integer numberOfFloars;
    private String FacilityFree;
    private FacilityType facilityType;
    private RentType rentType;
    private List<Contract> contractList;
}
