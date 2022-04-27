package bai_tap_case_study.service.co_so_vat_chat_impl;

import bai_tap_case_study.common.validate.ValidateAll;
import bai_tap_case_study.model.co_so_vat_chat.House;
import bai_tap_case_study.service.interf.i_co_so_vat_chat.IHouse;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HouseService implements IHouse {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Integer, House> house = new LinkedHashMap<>();

    @Override
    public void addNewHouse() {
        addInfoHouse();
    }

    private void addInfoHouse() {
        System.out.println("thêm mã dich vụ: ");
        String maDichVu = scanner.nextLine();

        regexMaDichVu(maDichVu);

        System.out.print("them ten dich vu: ");
        String tenDichVu = scanner.nextLine();

        tenDichVu = regexTenDichVu(tenDichVu);

        System.out.print("them chi phi thue: ");
        String chiPhiThue = scanner.nextLine();
        chiPhiThue = regexChiPhi(chiPhiThue);

        System.out.print("them dien tich su dung: ");
        String dienTichSD = scanner.nextLine();

        dienTichSD = regexDienTichSD(dienTichSD);

        System.out.print("them so luong nguoi: ");
        String soLuongNguoi = scanner.nextLine();
        soLuongNguoi = regexSoLuongNguoi(soLuongNguoi);

        System.out.print("them kieu thue: ");
        String kieuThue = scanner.nextLine();
        System.out.print("them tieu chuan phong: ");
        String tieuChuanPhong = scanner.nextLine();

        System.out.print("them so tang: ");
        String soTang = scanner.nextLine();
        soTang = regexSoTang(soTang);

        House house1 = new House(tenDichVu, chiPhiThue, dienTichSD, soLuongNguoi, kieuThue, tieuChuanPhong, soTang);
        System.out.println(house1);
        house.put(3, house1);
    }


    //-	Số tầng phải là số nguyên dương.
    private String regexSoTang(String soTang) {
        while(!ValidateAll.isMatchesSotang(soTang)){
            System.out.println("nhập sai định dạng: ");
            soTang = scanner.nextLine();
        }
        return soTang;
    }

//-	Số lượng người tối đa phải >0 và nhỏ hơn <20
    private String regexSoLuongNguoi(String soLuongNguoi) {
        while (!ValidateAll.isMatchesSoLuongNguoi(soLuongNguoi)){
            System.out.println("nhập sai tiêu chuẩn: ");
            soLuongNguoi = scanner.nextLine();
        }
        return soLuongNguoi;
    }

    //-	Chi phí thuê phải là số dương
    private String regexChiPhi(String chiPhiThue) {
        while (!ValidateAll.isMatchesChiPhi(chiPhiThue)){
            System.out.println("nhập sai định dạng r, nhập lại đi: ");
            chiPhiThue = scanner.nextLine();
        }
        return chiPhiThue;
    }
    private void regexMaDichVu(String maDichVu) {
        while (!ValidateAll.isMatchesHouse(maDichVu)) {
            System.out.println("ko đúng mã định dạng, nhập lại: ");
            maDichVu = scanner.nextLine();
        }
    }

    public String regexTenDichVu(String tenDichVu) {
        while (!ValidateAll.isMatchesNameService(tenDichVu)) {
            System.out.println("nhap ko đúng định dạng: ");
            tenDichVu = scanner.nextLine();
        }
        return tenDichVu;
    }

    private String regexDienTichSD(String dienTichSD) {
        while (!ValidateAll.isMatchesDienTich(dienTichSD)) {
            System.out.println("nhập sai dịnh dạng, phải >30m2: ");
            dienTichSD = scanner.nextLine();
        }
        return dienTichSD;

    }
}
