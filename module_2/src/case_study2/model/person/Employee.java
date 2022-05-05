package case_study2.model.person;

public class Employee extends Person{
    //Mã nhân viên, Họ tên, Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email, Trình độ, Vị trí, lương
    private String maNhanVien;
    private String TrinhDo;
    private String ViTri;
    private String luong;

    public Employee() {
    }

    public Employee(Integer id,String hoTen, String ngaySinh, String gioiTinh, Integer soCMND, Integer soDienThoai,
                    String email, String maNhanVien, String trinhDo, String viTri, String luong) {
        super(id,hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email);
        this.maNhanVien = maNhanVien;
        TrinhDo = trinhDo;
        ViTri = viTri;
        this.luong = luong;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTrinhDo() {
        return TrinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        TrinhDo = trinhDo;
    }

    public String getViTri() {
        return ViTri;
    }

    public void setViTri(String viTri) {
        ViTri = viTri;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee: " +super.toString()+
                ", maNhanVien= " + maNhanVien +
                ", TrinhDo= " + TrinhDo +
                ", ViTri= " + ViTri +
                ", luong= " + luong ;
    }
    public String getInfoEmployee(){
        //Integer id,String hoTen, String ngaySinh, String gioiTinh, Integer soCMND, Integer soDienThoai,
        //  String email, String maNhanVien, String trinhDo, String viTri, String luong
        return getId()+","+getHoTen()+","+getNgaySinh()+","+getGioiTinh()+","+getSoCMND()+","+getSoDienThoai()+","+
                getEmail()+","+getMaNhanVien()+","+getTrinhDo()+","+getViTri()+","+getLuong();
    }
}
