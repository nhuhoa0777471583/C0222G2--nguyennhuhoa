package bai_tap_case_study.service.facility_impl;

import bai_tap_case_study.common.read_write.ReadAll;
import bai_tap_case_study.common.read_write.WriteAll;
import bai_tap_case_study.model.facility.Villa;
import bai_tap_case_study.service.interf.i_facility.IVillaSevice;

import java.util.*;

public class VillaService implements IVillaSevice {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Villa> villa = new ArrayList<>();

    //Villa: String tenDichVu, String dienTichSuDung, String soLuongNguoi, String kieuThue,
    // String tieuChuanPhong, String dienTichHoBoi, String soTang
//    static {
//
//        villa.add(new Villa("00", "000", "00", "00", "00",
//                "00", "00", "00", "00"));
//        villa.add( new Villa("11", "11", "11", "11", "11",
//                "11", "11", "11", "1"));
//        villa.add(new Villa("22", "22", "22", "22", "22",
//                "22", "22", "22", "02220"));
//        WriteAll.writeVilla(villa,false);
//    }

    @Override
    public void addNewVila() {
        addInfoVilla();
    }

    @Override
    public void displayVilla() {
        villa= ReadAll.readVilla();
       for (Villa villa1: villa){
           System.out.println(villa1);
       }
    }

    private void addInfoVilla() {
        System.out.println("thêm mã dich vụ: ");
        String maDichVu = scanner.nextLine();
        //RegexService.regexMaDichVuVilla(maDichVu);
        System.out.print("them ten dich vu: ");
        String tenDichVu = scanner.nextLine();
        //RegexService.regexTenDichVu(tenDichVu);
        System.out.print("them chi phi thue: ");
        String chiPhiThue = scanner.nextLine();
        // RegexService.regexChiPhi(chiPhiThue);
        System.out.print("them dien tich su dung: ");
        String dienTichSD = scanner.nextLine();
        // RegexService.regexDienTichSD(dienTichSD);
        System.out.print("them so luong nguoi: ");
        String soLuongNguoi = scanner.nextLine();
        // RegexService.regexSoLuongNguoi(soLuongNguoi);
        System.out.print("them kieu thue: ");
        String kieuThue = scanner.nextLine();
        // RegexService.regexKieuThue(kieuThue);
        System.out.print("them tieu chuan phong: ");
        String tieuChuanPhong = scanner.nextLine();
        // RegexService.regexTieuChuanPhong(tieuChuanPhong);
        System.out.print("them dien tich ho boi: ");
        String dienTichHoBoi = scanner.nextLine();
        // RegexService.regexDienTichHoBoi(dienTichHoBoi);
        System.out.print("them so tang: ");
        String soTang = scanner.nextLine();
        //  RegexService.regexSoTang(soTang);
        Villa villas1 = new Villa(maDichVu, tenDichVu, chiPhiThue, dienTichSD, soLuongNguoi, kieuThue, tieuChuanPhong, dienTichHoBoi, soTang);
        System.out.println(villas1);
        villa.add( villas1);
        WriteAll.writeVilla(villa,false);
    }
}



