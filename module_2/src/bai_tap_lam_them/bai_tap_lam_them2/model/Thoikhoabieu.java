package bai_tap_lam_them.bai_tap_lam_them2.model;

public class Thoikhoabieu {
    // Mã công việc Tên công việc. Thứ (2, 3, 4, 5, 6, 7, CN)  Mức độ ưu tiên (High, Normal, Low)
    private String maCongViec;
    private String tenCongViec;
    private String thu;
    private String mucDo;

    public Thoikhoabieu() {
    }

    public Thoikhoabieu(String maCongViec, String tenCongViec, String thu, String mucDo) {
        this.maCongViec = maCongViec;
        this.tenCongViec = tenCongViec;
        this.thu = thu;
        this.mucDo = mucDo;
    }

    public String getMaCongViec() {
        return maCongViec;
    }

    public void setMaCongViec(String maCongViec) {
        this.maCongViec = maCongViec;
    }

    public String getTenCongViec() {
        return tenCongViec;
    }

    public void setTenCongViec(String tenCongViec) {
        this.tenCongViec = tenCongViec;
    }

    public String getThu() {
        return thu;
    }

    public void setThu(String thu) {
        this.thu = thu;
    }

    public String getMucDo() {
        return mucDo;
    }

    public void setMucDo(String mucDo) {
        this.mucDo = mucDo;
    }

    @Override
    public String toString() {
        return   "thu= " + thu +
                ", maCongViec= " + maCongViec +
                ", tenCongViec= " + tenCongViec +
                ", mucDo= " + mucDo ;
    }
    public String getInfoTKB(){
        return getThu()+","+getMaCongViec()+","+getTenCongViec()+","+getMucDo();
    }
}
