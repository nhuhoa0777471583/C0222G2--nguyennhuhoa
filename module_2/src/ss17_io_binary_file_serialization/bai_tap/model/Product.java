package ss17_io_binary_file_serialization.bai_tap.model;

import java.io.Serializable;

public class Product implements Serializable {
    private Integer id;
    private String tenSanPham;
    private String hangSanXuat;
    private Integer gia;
    private String moTaVeSanPham;

    public Product()  {
    }

    public Product(Integer id, String tenSanPham, String hangSanXuat, Integer gia, String moTaVeSanPham) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.hangSanXuat = hangSanXuat;
        this.gia = gia;
        this.moTaVeSanPham = moTaVeSanPham;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public String getMoTaVeSanPham() {
        return moTaVeSanPham;
    }

    public void setMoTaVeSanPham(String moTaVeSanPham) {
        this.moTaVeSanPham = moTaVeSanPham;
    }

    @Override
    public String toString() {
        return "id= " + id +
                ", tenSanPham= " + tenSanPham  +
                ", hangSanXuat= " + hangSanXuat  +
                ", gia=" + gia +
                ", moTaVeSanPham= " + moTaVeSanPham ;
    }
}
