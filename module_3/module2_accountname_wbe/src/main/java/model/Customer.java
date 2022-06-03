package model;

import java.util.Date;

public class Customer {
// id_customer int primary key,
//name_customer varchar(50),
//birthday_customer date,
// gender_customer bit(1),
// id_card_customer varchar(50),
// phone varchar(50),
// email varchar(50),
// address varchar(50),
// id_customer_type int,
    private Integer id ;
    private String name;
    private Date birthday;
    private Integer gender;
    private String idCard;
    private String phone;
    private String email;
    private String address;
    private Integer idCustomerType;

    public Customer(){}
    public Customer(Integer id, String name, Date birthday, Integer gender, String idCard, String phone, String email, String address, Integer idCustomerType) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.idCustomerType = idCustomerType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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

    public Integer getIdCustomerType() {
        return idCustomerType;
    }

    public void setIdCustomerType(Integer idCustomerType) {
        this.idCustomerType = idCustomerType;
    }
}
