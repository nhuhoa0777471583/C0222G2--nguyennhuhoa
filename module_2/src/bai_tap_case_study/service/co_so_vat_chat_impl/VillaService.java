package bai_tap_case_study.service.co_so_vat_chat_impl;

import bai_tap_case_study.common.validate.RegexService;
import bai_tap_case_study.model.co_so_vat_chat.Villa;
import bai_tap_case_study.service.interf.i_co_so_vat_chat.IVilla;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class VillaService extends RegexService implements IVilla {
    protected static Scanner scanner = new Scanner(System.in);
    public static Map<Integer, Villa> villa = new LinkedHashMap<>();

    //Villa: String tenDichVu, String dienTichSuDung, String soLuongNguoi, String kieuThue,
    // String tieuChuanPhong, String dienTichHoBoi, String soTang
    static {

    }

    @Override
    public void addNewVila() {
        addInfoVilla();
    }

    @Override
    public void displayVilla() {
        Set<Map.Entry<Integer, Villa>> villaSet = villa.entrySet();
        for (Map.Entry<Integer, Villa> v : villaSet) {
            System.out.println(v);
        }
    }

    private void addInfoVilla() {
        System.out.println("thêm mã dich vụ: ");
        String maDichVu = scanner.nextLine();
        // regexMaDichVuVilla(maDichVu);
        System.out.print("them ten dich vu: ");
        String tenDichVu = scanner.nextLine();
        // regexTenDichVu(tenDichVu);
        System.out.print("them chi phi thue: ");
        String chiPhiThue = scanner.nextLine();
        //  regexChiPhi(chiPhiThue);
        System.out.print("them dien tich su dung: ");
        String dienTichSD = scanner.nextLine();
        // regexDienTichSD(dienTichSD);
        System.out.print("them so luong nguoi: ");
        String soLuongNguoi = scanner.nextLine();
        //  regexSoLuongNguoi(soLuongNguoi);
        System.out.print("them kieu thue: ");
        String kieuThue = scanner.nextLine();
        // regexKieuThue(kieuThue);
        System.out.print("them tieu chuan phong: ");
        String tieuChuanPhong = scanner.nextLine();
        // regexTieuChuanPhong(tieuChuanPhong);
        System.out.print("them dien tich ho boi: ");
        String dienTichHoBoi = scanner.nextLine();
        // regexDienTichHoBoi(dienTichHoBoi);
        System.out.print("them so tang: ");
        String soTang = scanner.nextLine();
        //  regexSoTang(soTang);
        Villa villas1 = new Villa(maDichVu, tenDichVu, chiPhiThue, dienTichSD, soLuongNguoi, kieuThue, tieuChuanPhong, dienTichHoBoi, soTang);
        System.out.println(villas1);
        villa.put(1, villas1);
    }
}



