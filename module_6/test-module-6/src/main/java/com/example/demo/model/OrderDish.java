package com.example.demo.model;

import javax.persistence.*;

@Entity
public class OrderDish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "table_id", referencedColumnName = "tableId")
    private TableManage tableManage;
    private String orderCode;
    private Integer quantity;
    private String dish;
    private String employee;
    private Integer isDelete;

    public OrderDish() {
    }

    public OrderDish(Integer id, TableManage tableManage, String orderCode, Integer quantity, String dish, String employee, Integer isDelete) {
        this.id = id;
        this.tableManage = tableManage;
        this.orderCode = orderCode;
        this.quantity = quantity;
        this.dish = dish;
        this.employee = employee;
        this.isDelete = isDelete;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TableManage getTableManage() {
        return tableManage;
    }

    public void setTableManage(TableManage tableManage) {
        this.tableManage = tableManage;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}
