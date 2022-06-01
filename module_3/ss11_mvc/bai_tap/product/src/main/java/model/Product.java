package model;

public class Product {
    private Integer id ;
    private String name;
    private Integer giaBan;
    private String moTa;
    private String nhaSanXuat;

    public Product(){}
    public Product(Integer id, String name, Integer giaBan, String moTa, String nhaSanXuat) {
        this.id = id;
        this.name = name;
        this.giaBan = giaBan;
        this.moTa = moTa;
        this.nhaSanXuat= nhaSanXuat;
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

    public Integer getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Integer giaBan) {
        this.giaBan = giaBan;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }
}
