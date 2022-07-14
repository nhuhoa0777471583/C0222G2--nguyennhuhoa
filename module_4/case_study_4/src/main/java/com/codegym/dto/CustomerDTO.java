package com.codegym.dto;

import com.codegym.model.contract.Contract;
import com.codegym.model.customers.CustomerType;

import javax.validation.GroupSequence;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.List;

@GroupSequence(value = {CustomerDTO.class, FirstVali.class, SecondVali.class})
public class CustomerDTO {

    //    @Pattern(regexp = "^([A-vxyỳọáầảấờễàạằệếýộậốũứĩõúữịỗìềểẩớặòùồợãụủíỹắẫựỉỏừỷởóéửỵẳẹèẽổẵẻỡơôưăêâđ]+)((\\s{1}[A-vxyỳọáầảấờễàạằệếýộậốũứĩõúữịỗìềểẩớặòùồợãụủíỹắẫựỉỏừỷởóéửỵẳẹèẽổẵẻỡơôưăêâđ]+){1,})$")
    @NotBlank(message = "ko đc để trống", groups = FirstVali.class)
    @Pattern(regexp = "^([A-Z][^A-Z0-9\\s]+)(\\s[A-Z][^A-Z0-9\\s]+)*$",
            message = "kí tự đầu của mỗi từ phải in hoa", groups = SecondVali.class)
    private String nameCustomer;
    @NotBlank(message = "ko đc để trống", groups = FirstVali.class)
    private String birdthday;

    private Integer gender;

    @NotBlank(message = "ko đc để trống", groups = FirstVali.class)
    @Pattern(regexp = "^[0-9]{9}$", message = "số cmnd/cccd phải là 9 số", groups = SecondVali.class)
    private String idCard;

    @NotBlank(message = "ko đc để trống", groups = FirstVali.class)
    @Pattern(regexp = "^((090)|(091)|(\\(84\\)\\+90)|(\\(84\\)\\+91)){1}[0-9]{7}$",
            message = "số phone ko dài quá 10 số và phải có định dạng: 090, 091, (84)+90,(84)+91", groups = SecondVali.class)
    private String phone;

    @NotBlank(message = "ko đc để trống", groups = FirstVali.class)
    @Pattern(regexp = "^[A-Za-z0-9]+(\\@gmail.com)$", message = "email sai định dạng ", groups = SecondVali.class)
    private String email;

    @NotBlank(message = "ko đc để trống", groups = FirstVali.class)
    private String address;
    private CustomerType customerType;
    private List<Contract> contractList;

    public CustomerDTO() {
    }

    public CustomerDTO(@NotBlank(message = "ko đc để trống", groups = FirstVali.class) @Pattern(regexp = "^([A-Z][^A-Z0-9\\s]+)(\\s[A-Z][^A-Z0-9\\s]+)*$",
            message = "kí tự đầu của mỗi từ phải in hoa", groups = SecondVali.class) String nameCustomer, @NotBlank(message = "ko đc để trống", groups = FirstVali.class) String birdthday, Integer gender, @NotBlank(message = "ko đc để trống", groups = FirstVali.class) @Pattern(regexp = "^[0-9]{9}$", message = "số cmnd/cccd phải là 9 số", groups = SecondVali.class) String idCard, @NotBlank(message = "ko đc để trống", groups = FirstVali.class) @Pattern(regexp = "^((090)|(091)|(\\(84\\)\\+90)|(\\(84\\)\\+91)){1}[0-9]{7}$",
            message = "số phone ko dài quá 10 số và phải có định dạng: 090, 091, (84)+90,(84)+91", groups = SecondVali.class) String phone, @NotBlank(message = "ko đc để trống", groups = FirstVali.class) @Pattern(regexp = "^[A-Za-z0-9]+(\\@gmail.com)$", message = "email sai định dạng ", groups = SecondVali.class) String email, @NotBlank(message = "ko đc để trống", groups = FirstVali.class) String address, CustomerType customerType, List<Contract> contractList) {
        this.nameCustomer = nameCustomer;
        this.birdthday = birdthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
        this.contractList = contractList;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirdthday() {
        return birdthday;
    }

    public void setBirdthday(String birdthday) {
        this.birdthday = birdthday;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }
}
