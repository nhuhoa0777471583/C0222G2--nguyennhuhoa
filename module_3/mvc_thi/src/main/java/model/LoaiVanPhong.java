package model;

public class LoaiVanPhong {
    private Integer maLoaiVanPhong;
    private String tenLoaiVanPhong;

    public LoaiVanPhong() {
    }

    public LoaiVanPhong(Integer maLoaiVanPhong, String tenLoaiVanPhong) {
        this.maLoaiVanPhong = maLoaiVanPhong;
        this.tenLoaiVanPhong = tenLoaiVanPhong;
    }

    public Integer getMaLoaiVanPhong() {
        return maLoaiVanPhong;
    }

    public void setMaLoaiVanPhong(Integer maLoaiVanPhong) {
        this.maLoaiVanPhong = maLoaiVanPhong;
    }

    public String getTenLoaiVanPhong() {
        return tenLoaiVanPhong;
    }

    public void setTenLoaiVanPhong(String tenLoaiVanPhong) {
        this.tenLoaiVanPhong = tenLoaiVanPhong;
    }
}
