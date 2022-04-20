package bai_tap_case_study.model;

import java.util.Date;

public class Room extends Furama{
    private String dichVuFree;
    public Room(){}

    public Room(String tenDichVu, String dienTichSuDung, String soLuongNguoi, Date kieuThue,String dichVuFree){
        super(tenDichVu,dienTichSuDung,soLuongNguoi,kieuThue);
        this.dichVuFree = dichVuFree;
    }

    @Override
    public String toString() {
        return "Room: " +
                "dichVuFree= " + dichVuFree + '\'' + super.toString();
    }
}
