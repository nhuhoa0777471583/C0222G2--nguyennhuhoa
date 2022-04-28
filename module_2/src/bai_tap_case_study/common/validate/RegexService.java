package bai_tap_case_study.common.validate;

import java.util.Scanner;

public class RegexService {
    private static Scanner scanner = new Scanner(System.in);


    public String regexTieuChuanPhong(String tieuChuanPhong) {
        while (!ValidateAll.isMatchesNameService(tieuChuanPhong)) {
            System.out.println("nhập sai định dạng: ");
            tieuChuanPhong = scanner.nextLine();
        }
        return tieuChuanPhong;
    }

    public String regexKieuThue(String kieuThue) {
        while (!ValidateAll.isMatchesNameService(kieuThue)) {
            System.out.println("nhập sai định dạng: ");
            kieuThue = scanner.nextLine();
        }
        return kieuThue;
    }

    //-	Số tầng phải là số nguyên dương.
    public String regexSoTang(String soTang) {
        while (!ValidateAll.isMatchesSotang(soTang)) {
            System.out.println("nhập sai định dạng: ");
            soTang = scanner.nextLine();
        }
        return soTang;
    }

    //-	Chi phí thuê phải là số dương
    public String regexChiPhi(String chiPhiThue) {
        while (!ValidateAll.isMatchesChiPhi(chiPhiThue)) {
            System.out.println("nhập sai định dạng r, nhập lại đi: ");
            chiPhiThue = scanner.nextLine();
        }
        return chiPhiThue;
    }

    //-	Mã dịch vụ phải đúng định dạng: SVXX-YYYY, với YYYY là các số từ 0-9, XX là:
    //-	Nếu là Villa thì XX sẽ là VL
    public void regexMaDichVuVilla(String maDichVu) {
        while (!ValidateAll.isMatchesVilla(maDichVu)) {
            System.out.println("ko đúng mã định dạng, nhập lại: ");
            maDichVu = scanner.nextLine();
        }
    }

    public void regexMaDichVuHouse(String maDichVu) {
        while (!ValidateAll.isMatchesHouse(maDichVu)) {
            System.out.println("ko đúng mã định dạng, nhập lại: ");
            maDichVu = scanner.nextLine();
        }
    }

    public void regexMaDichVuRoom(String maDichVu) {
        while (!ValidateAll.isMatchesRoom(maDichVu)) {
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
    public String regexSoLuongNguoi(String soLuongNguoi) {
        while (!ValidateAll.isMatchesSoLuongNguoi(soLuongNguoi)) {
            System.out.println("nhập sai tiêu chuẩn: ");
            soLuongNguoi = scanner.nextLine();
        }
        return soLuongNguoi;
    }


    //-	Diện tích sử dụng và diện tích hồ bơi phải là số thực lớn hơn 30m2
    public String regexDienTichHoBoi(String dienTichHoBoi) {
        while (!ValidateAll.isMatchesDienTich(dienTichHoBoi)) {
            System.out.println("nhập sai dịnh dạng, phải >30m2: ");
            dienTichHoBoi = scanner.nextLine();
        }
        return dienTichHoBoi;
    }

    public String regexDienTichSD(String dienTichSD) {
        while (!ValidateAll.isMatchesDienTich(dienTichSD)) {
            System.out.println("nhập sai dịnh dạng, phải >30m2: ");
            dienTichSD = scanner.nextLine();
        }
        return dienTichSD;
    }
}
