package com.codegym.model.contract;

import javax.persistence.*;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_contract",referencedColumnName = "id")
    private Contract contract;
    @ManyToOne
    @JoinColumn(name = "id_attach_facility",referencedColumnName = "id")
    private AttachFacility attachFacility;

    private Integer quantity;

    public ContractDetail() {
    }

    public ContractDetail(Integer id, Contract contract, AttachFacility attachFacility, Integer quantity) {
        this.id = id;
        this.contract = contract;
        this.attachFacility = attachFacility;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AttachFacility getAttachFacility() {
        return attachFacility;
    }

    public void setAttachFacility(AttachFacility attachFacility) {
        this.attachFacility = attachFacility;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
