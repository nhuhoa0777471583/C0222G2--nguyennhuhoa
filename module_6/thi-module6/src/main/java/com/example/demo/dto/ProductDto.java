package com.example.demo.dto;

import com.example.demo.model.product.OrderProduct;
import com.example.demo.model.product.ProductType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@RequiredArgsConstructor
public class ProductDto {

    @NotBlank(message = "vui lòng điền thông tin.")
    private String codeProduct;
    @NotBlank(message = "vui lòng điền thông tin.")
    private Double price;
    @NotBlank(message = "vui lòng điền thông tin.")
    private String statusProduct;
    @NotBlank(message = "vui lòng điền thông tin.")
    @PastOrPresent(message = "vui lòng không nhập quá ngày hiện tại.")
    private Date creationDate;
    @NotBlank(message = "vui lòng điền thông tin.")
    private Boolean isDeleted;
    @NotBlank(message = "vui lòng điền thông tin.")
    private List<OrderProduct> orderProductList;
    @NotBlank(message = "vui lòng điền thông tin.")
    private ProductType productType;
}
