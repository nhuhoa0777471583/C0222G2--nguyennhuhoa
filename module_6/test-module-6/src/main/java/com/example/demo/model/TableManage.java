package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class TableManage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tableId;
    private String tableNumber;
    private Integer tableStatus;
    private String isEmpty;
    private Integer isDeleted;
    @OneToMany(mappedBy = "tableManage")
    private List<OrderDish> orderDish;
    public TableManage() {
    }

    public TableManage(Integer tableId, String tableNumber, Integer tableStatus, String isEmpty, Integer isDeleted, List<OrderDish> orderDish) {
        this.tableId = tableId;
        this.tableNumber = tableNumber;
        this.tableStatus = tableStatus;
        this.isEmpty = isEmpty;
        this.isDeleted = isDeleted;
        this.orderDish = orderDish;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Integer getTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(Integer tableStatus) {
        this.tableStatus = tableStatus;
    }

    public String getIsEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(String isEmpty) {
        this.isEmpty = isEmpty;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public List<OrderDish> getOrderDish() {
        return orderDish;
    }

    public void setOrderDish(List<OrderDish> orderDish) {
        this.orderDish = orderDish;
    }
}
