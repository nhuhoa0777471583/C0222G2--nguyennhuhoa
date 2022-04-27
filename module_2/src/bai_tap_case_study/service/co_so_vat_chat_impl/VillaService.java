package bai_tap_case_study.service.co_so_vat_chat_impl;

import bai_tap_case_study.common.validate.ValidateAll;
import bai_tap_case_study.model.co_so_vat_chat.Villa;
import bai_tap_case_study.service.interf.i_co_so_vat_chat.IVilla;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class VillaService implements IVilla {
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
    private void addInfoVilla() {
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
        System.out.print("them dien tich ho boi: ");
        String dienTichHoBoi = scanner.nextLine();

        dienTichHoBoi = regexDienTichHoBoi(dienTichHoBoi);

        System.out.print("them so tang: ");
        String soTang = scanner.nextLine();
        soTang = regexSoTang(soTang);

        Villa villas1 = new Villa(tenDichVu,chiPhiThue, dienTichSD, soLuongNguoi, kieuThue, tieuChuanPhong, dienTichHoBoi, soTang);
        System.out.println(villas1);
        villa.put(1, villas1);
    }
//-	Số tầng phải là số nguyên dương.
    private String regexSoTang(String soTang) {
        while(!ValidateAll.isMatchesSotang(soTang)){
            System.out.println("nhập sai định dạng: ");
            soTang = scanner.nextLine();
        }
        return soTang;
    }

    //-	Chi phí thuê phải là số dương
    private String regexChiPhi(String chiPhiThue) {
        while (!ValidateAll.isMatchesChiPhi(chiPhiThue)){
            System.out.println("nhập sai định dạng r, nhập lại đi: ");
            chiPhiThue = scanner.nextLine();
        }
        return chiPhiThue;
    }

    //-	Mã dịch vụ phải đúng định dạng: SVXX-YYYY, với YYYY là các số từ 0-9, XX là:
    //-	Nếu là Villa thì XX sẽ là VL
    private void regexMaDichVu(String maDichVu) {
        while (!ValidateAll.isMatchesVilla(maDichVu)) {
            System.out.println("ko đúng mã định dạng, nhập lại: ");
            maDichVu = scanner.nextLine();
        }
    }

    //-	Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường
    public String regexTenDichVu(String tenDichVu) {
        while (!ValidateAll.isMatchesNameService(tenDichVu)) {
            System.out.println("nhap ko đúng định dạng: ");
            tenDichVu = scanner.nextLine();
        }
        return tenDichVu;
    }

    //-	Số lượng người tối đa phải >0 và nhỏ hơn <20
    private String regexSoLuongNguoi(String soLuongNguoi) {
        while (!ValidateAll.isMatchesSoLuongNguoi(soLuongNguoi)){
            System.out.println("nhập sai tiêu chuẩn: ");
            soLuongNguoi = scanner.nextLine();
        }
        return soLuongNguoi;
    }


//-	Diện tích sử dụng và diện tích hồ bơi phải là số thực lớn hơn 30m2
    private String regexDienTichHoBoi(String dienTichHoBoi) {
        while (!ValidateAll.isMatchesDienTich(dienTichHoBoi)) {
            System.out.println("nhập sai dịnh dạng, phải >30m2: ");
            dienTichHoBoi = scanner.nextLine();
        }
        return dienTichHoBoi;
    }

    private String regexDienTichSD(String dienTichSD) {
        while (!ValidateAll.isMatchesDienTich(dienTichSD)) {
            System.out.println("nhập sai dịnh dạng, phải >30m2: ");
            dienTichSD = scanner.nextLine();
        }
        return dienTichSD;
    }
}



