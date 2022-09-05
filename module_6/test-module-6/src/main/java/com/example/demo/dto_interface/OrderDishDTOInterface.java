package com.example.demo.dto_interface;

import com.example.demo.model.TableManage;

public interface OrderDishDTOInterface {
    Integer getId();
    TableManage getTableManage();
    String getOrderCode();
    Integer getQuantity();
    String getDish();
    String getEmployee();
    Integer getIsDelete();
}
