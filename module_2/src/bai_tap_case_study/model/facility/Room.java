package bai_tap_case_study.model.facility;

public class Room extends FacilityFurama {
    private String dichVuFree;
    public Room(){}

    public Room(String maDichVu,String tenDichVu, String chiPhi, String dienTichSuDung,
                String soLuongNguoi, String kieuThue,String dichVuFree){
        super(maDichVu,tenDichVu,chiPhi,dienTichSuDung,soLuongNguoi,kieuThue);
        this.dichVuFree = dichVuFree;
    }

    public String getDichVuFree() {
        return dichVuFree;
    }

    public void setDichVuFree(String dichVuFree) {
        this.dichVuFree = dichVuFree;
    }

    @Override
    public String toString() {
        return "Room: "+ super.toString() +
                ", dichVuFree= " + dichVuFree ;
    }
    public String getInfoRoom() {
        return getMaDichVu() + "," + getTenDichVu() + "," + getChiPhiThue() + "," +
                getDienTichSuDung() + "," + getSoLuongNguoi() + "," +
                getKieuThue() + "," + getDichVuFree() ;
    }

}
