package model;

public class Product {
    private Integer id ;
    private String name;
    private Integer giaBan;
    private Integer soLuong;

    public Product(){}
    public Product(Integer id, String name, Integer giaBan, Integer soLuong) {
        this.id = id;
        this.name = name;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
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

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }
}
