package com.example.demo.dto;

import com.example.demo.model.Category;

import java.util.Date;

public interface ProductDto {
    Integer getId();

    String getName();

    Date getCreateDate();

    Integer getCost();

    Double getPrice();

    String getMadeIn();

    String getDescription();

    String getSpecifications();

    Category getCategory();

    String getImage();

    Boolean getIsDelete();

    String getStatusProduct();

}
