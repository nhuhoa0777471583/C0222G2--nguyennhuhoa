package com.codegym.model.contract;


import com.codegym.model.customers.Customer;
import com.codegym.model.employee.Employee;
import com.codegym.model.facility.Facility;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String startDate;
    private String endDate;
    private Double deposit;
    @ManyToOne
    @JoinColumn(name = "id_employee", referencedColumnName = "id")
    private Employee employee;
    @ManyToOne
    @JoinColumn(name = "id_customer", referencedColumnName = "id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "id_facility", referencedColumnName = "id")
    private Facility facility;

    @ManyToMany
    @JoinTable(name = "contract_detail",
            joinColumns =@JoinColumn(name="id_contract"),
            inverseJoinColumns = @JoinColumn(name = "id_attach_facility"))
    private Set<AttachFacility> attachFacilitySet;




    public Contract() {
    }

    public Contract(Integer id, String startDate, String endDate, Double deposit, Employee employee, Customer customer, Facility facility, Set<AttachFacility> attachFacilitySet) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deposit = deposit;
        this.employee = employee;
        this.customer = customer;
        this.facility = facility;
        this.attachFacilitySet = attachFacilitySet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Set<AttachFacility> getAttachFacilitySet() {
        return attachFacilitySet;
    }

    public void setAttachFacilitySet(Set<AttachFacility> attachFacilitySet) {
        this.attachFacilitySet = attachFacilitySet;
    }
}
