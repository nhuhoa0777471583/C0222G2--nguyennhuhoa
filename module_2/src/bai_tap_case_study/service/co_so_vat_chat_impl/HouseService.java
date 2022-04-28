package bai_tap_case_study.service.co_so_vat_chat_impl;

import bai_tap_case_study.common.validate.RegexService;
import bai_tap_case_study.common.validate.ValidateAll;
import bai_tap_case_study.model.co_so_vat_chat.House;
import bai_tap_case_study.service.interf.i_co_so_vat_chat.IHouse;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HouseService extends RegexService implements IHouse {

    private static Scanner scanner = new Scanner(System.in);
    private static Map<Integer, House> house = new LinkedHashMap<>();

    @Override
    public void addNewHouse() {
        addInfoHouse();
    }

    @Override
    public void dislayHouse() {
        Set<Map.Entry<Integer, House>>houseSet= house.entrySet();
        for (Map.Entry<Integer, House> h: houseSet) {
            System.out.println(h);
        }
    }

    private void addInfoHouse() {
        System.out.print("thêm mã dich vụ: ");
        String maDichVu = scanner.nextLine();
//        regexMaDichVu(maDichVu);
        System.out.print("them ten dich vu: ");
        String tenDichVu = scanner.nextLine();
//        tenDichVu = regexTenDichVu(tenDichVu);
        System.out.print("them chi phi thue: ");
        String chiPhiThue = scanner.nextLine();
//        regexChiPhi(chiPhiThue);
        System.out.print("them dien tich su dung: ");
        String dienTichSD = scanner.nextLine();
//        regexDienTichSD(dienTichSD);
        System.out.print("them so luong nguoi: ");
        String soLuongNguoi = scanner.nextLine();
//        regexSoLuongNguoi(soLuongNguoi);
        System.out.print("them kieu thue: ");
        String kieuThue = scanner.nextLine();
//        regexKieuThue(kieuThue);
        System.out.print("them tieu chuan phong: ");
        String tieuChuanPhong = scanner.nextLine();
//        regexTieuChuanPhong(tieuChuanPhong);
        System.out.print("them so tang: ");
        String soTang = scanner.nextLine();
//        regexSoTang(soTang);
        House house1 = new House(maDichVu, tenDichVu, chiPhiThue, dienTichSD, soLuongNguoi, kieuThue, tieuChuanPhong, soTang);
        System.out.println(house1);
        house.put(3, house1);
    }
}
