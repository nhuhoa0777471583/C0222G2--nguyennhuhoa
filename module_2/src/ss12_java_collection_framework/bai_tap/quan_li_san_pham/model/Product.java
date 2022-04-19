package ss12_java_collection_framework.bai_tap.quan_li_san_pham.model;

public class Product {

    private Integer id;
    private String tenSanPham;
    private Integer giaCa;
    private Integer soLuongSanPham;

    public Product() {
    }

    public Product(Integer id, String tenSanPham, Integer giaCa, Integer soLuongSanPham) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.giaCa = giaCa;
        this.soLuongSanPham = soLuongSanPham;
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

    public Integer getGiaCa() {
        return giaCa;
    }

    public void setGiaCa(Integer giaCa) {
        this.giaCa = giaCa;
    }

    public Integer getSoLuongSanPham() {
        return soLuongSanPham;
    }

    public void setSoLuongSanPham(Integer soLuongSanPham) {
        this.soLuongSanPham = soLuongSanPham;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", tenSanPham= " + tenSanPham + '\'' +
                ", giaCa= " + giaCa + '\'' +
                ", soLuongSanPham= " + soLuongSanPham;
    }
}
