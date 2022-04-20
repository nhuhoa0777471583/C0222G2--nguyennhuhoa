package bai_tap_case_study.model.co_so_vat_chat;

import java.util.Date;

public class Room extends FacilityFurama {
    private String dichVuFree;
    public Room(){}

    public Room(String tenDichVu, String dienTichSuDung, String soLuongNguoi, Date kieuThue,String dichVuFree){
        super(tenDichVu,dienTichSuDung,soLuongNguoi,kieuThue);
        this.dichVuFree = dichVuFree;
    }

    @Override
    public String toString() {
        return "Room: "+ super.toString()+ '\''  +
                "dichVuFree= " + dichVuFree ;
    }
}
