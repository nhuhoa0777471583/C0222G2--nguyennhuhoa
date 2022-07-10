package com.codegym.dto;

import javax.validation.constraints.Pattern;

public class CustomerDTO {

    @Pattern(regexp = "^([A-Z][vxyỳọáầảấờễàạằệếýộậốũứĩõúữịỗìềểẩớặòùồợãụủíỹắẫựỉỏừỷởóéửỵẳẹèẽổẵẻỡơôưăêâđ]+)((\\s{1}[A-Z][vxyỳọáầảấờễàạằệếýộậốũứĩõúữịỗìềểẩớặòùồợãụủíỹắẫựỉỏừỷởóéửỵẳẹèẽổẵẻỡơôưăêâđ]+){1,})$")
    private String nameCustomer;
    private String birdthday;
    private Integer gender;
    private String idCard;
    private String phone;
    private String email;
    private String address;
}
