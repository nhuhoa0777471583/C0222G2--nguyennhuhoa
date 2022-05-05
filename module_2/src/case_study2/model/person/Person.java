package case_study2.model.person;

public class Person {
    //Họ tên, Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email
    private Integer id;
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private Integer soCMND;
    private Integer soDienThoai;
    private String Email;

    public Person() {
    }

    public Person(Integer id, String hoTen, String ngaySinh, String gioiTinh, Integer soCMND, Integer soDienThoai, String email) {
        this.id = id;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        this.soDienThoai = soDienThoai;
        Email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Integer getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(Integer soCMND) {
        this.soCMND = soCMND;
    }

    public Integer getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(Integer soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {


        return " id= " + id +
                ", hoTen= " + hoTen +
                ", ngaySinh= " + ngaySinh +
                ", gioiTinh= " + gioiTinh +
                ", soCMND= " + soCMND +
                ", soDienThoai= " + soDienThoai +
                ", Email= " + Email;
    }
}
