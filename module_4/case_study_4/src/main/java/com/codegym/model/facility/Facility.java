package com.codegym.model.facility;


import com.codegym.model.contract.Contract;

import javax.persistence.*;
import java.util.List;

@Entity
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nameFacility;
    private Integer area;
    private Double cost;
    @Column(name = "max_people")
    private Integer maxPeople;
    @Column(name = "standard_room")
    private String standardRoom;
    @Column(name = "description_other_convenience")
    private String descriptionOtherConvenience;
    @Column(name = "pool_area")
    private Double poolArea;
    @Column(name = "number_of_floors")
    private Integer numberOfFloars;
    private String FacilityFree;
    @ManyToOne
    @JoinColumn(name = "id_facility_type", referencedColumnName = "id")
    private FacilityType facilityType;
    @ManyToOne
    @JoinColumn(name = "id_rent_type", referencedColumnName = "id")
    private RentType rentType;
    @OneToMany(mappedBy = "facility")
    private List<Contract> contractList;



    public Facility() {
    }

    public Facility(Integer id, String nameFacility, Integer area, Double cost, Integer maxPeople, String standardRoom, String descriptionOtherConvenience, Double poolArea, Integer numberOfFloars, String facilityFree, FacilityType facilityType, RentType rentType, List<Contract> contractList) {
        this.id = id;
        this.nameFacility = nameFacility;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloars = numberOfFloars;
        FacilityFree = facilityFree;
        this.facilityType = facilityType;
        this.rentType = rentType;
        this.contractList = contractList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return nameFacility;
    }

    public void setName(String name) {
        this.nameFacility = name;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(Integer maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public Double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Double poolArea) {
        this.poolArea = poolArea;
    }

    public Integer getNumberOfFloars() {
        return numberOfFloars;
    }

    public void setNumberOfFloars(Integer numberOfFloars) {
        this.numberOfFloars = numberOfFloars;
    }

    public String getFacilityFree() {
        return FacilityFree;
    }

    public void setFacilityFree(String facilityFree) {
        FacilityFree = facilityFree;
    }

    public FacilityType getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(FacilityType facilityType) {
        this.facilityType = facilityType;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }
}
