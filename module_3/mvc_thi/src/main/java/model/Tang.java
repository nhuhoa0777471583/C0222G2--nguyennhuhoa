package model;

public class Tang {
    private Integer maTang;
    private Integer soTang;

    public Tang() {
    }

    public Tang(Integer maTang, Integer soTang) {
        this.maTang = maTang;
        this.soTang = soTang;
    }

    public Integer getMaTang() {
        return maTang;
    }

    public void setMaTang(Integer maTang) {
        this.maTang = maTang;
    }

    public Integer getSoTang() {
        return soTang;
    }

    public void setSoTang(Integer soTang) {
        this.soTang = soTang;
    }
}
