package com.example.demo.model;



import javax.persistence.*;
import java.util.Date;


@Entity
public class Abc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(columnDefinition = "date")
    private Date createDate;
    private Integer cost;
    private Double price;
    private String madeIn;
    @ManyToOne
    @JoinColumn(name = "id_category_phone", referencedColumnName = "id")
    private CategoryPhone categoryPhone;

    @Column(columnDefinition = "text")
    private String image;
    @Column(columnDefinition = "bit(0) default 1")
    private Boolean isDelete;
    @Column(columnDefinition = "bit(0) default 1")
    private Boolean statusPhone;

    public Abc() {
    }

    public Abc(Integer id, String name, Date createDate, Integer cost, Double price, String madeIn, CategoryPhone categoryPhone, String image, Boolean isDelete, Boolean statusPhone) {
        this.id = id;
        this.name = name;
        this.createDate = createDate;
        this.cost = cost;
        this.price = price;
        this.madeIn = madeIn;
        this.categoryPhone = categoryPhone;
        this.image = image;
        this.isDelete = isDelete;
        this.statusPhone = statusPhone;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public CategoryPhone getCategoryPhone() {
        return categoryPhone;
    }

    public void setCategoryPhone(CategoryPhone categoryPhone) {
        this.categoryPhone = categoryPhone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public Boolean getStatusPhone() {
        return statusPhone;
    }

    public void setStatusPhone(Boolean statusPhone) {
        this.statusPhone = statusPhone;
    }


}
