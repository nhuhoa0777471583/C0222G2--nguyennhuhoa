package bai_tap_case_study.service.co_so_vat_chat_impl;

import bai_tap_case_study.common.validate.ValidateAll;
import bai_tap_case_study.model.co_so_vat_chat.House;
import bai_tap_case_study.model.co_so_vat_chat.Room;
import bai_tap_case_study.service.interf.i_co_so_vat_chat.IRoom;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RoomService implements IRoom {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Integer, Room> room = new LinkedHashMap<>();

    //Room:String tenDichVu, String dienTichSuDung, String soLuongNguoi, String kieuThue,String dichVuFree

    @Override
    public void addNewRoom() {
        addInfoRoom();
    }
    private void addInfoRoom() {
        System.out.println("thêm ma dich vụ: ");
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
        System.out.print("them ten dich vu: ");
        String dichVuFree = scanner.nextLine();
        Room rooms1 = new Room(tenDichVu,chiPhiThue, dienTichSD, soLuongNguoi, kieuThue, dichVuFree);
        System.out.println(rooms1);
        room.put(2, rooms1);
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

    //-	Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường
    public String regexTenDichVu(String tenDichVu) {
        while (!ValidateAll.isMatchesNameService(tenDichVu)){
            System.out.println("nhap ko đúng định dạng: ");
            tenDichVu = scanner.nextLine();
        }
        return tenDichVu;
    }

    //-	Mã dịch vụ phải đúng định dạng: SVXX-YYYY, với YYYY là các số từ 0-9, XX là:
    //-	Nếu là Villa thì XX sẽ là VL
    private void regexMaDichVu(String maDichVu) {
        while (!ValidateAll.isMatchesRoom(maDichVu)) {
            System.out.println("ko đúng mã định dạng, nhập lại: ");
            maDichVu = scanner.nextLine();
        }
    }

    //-	Diện tích sử dụng và diện tích hồ bơi phải là số thực lớn hơn 30m2
    private String regexDienTichSD(String dienTichSD) {
        while (!ValidateAll.isMatchesDienTich(dienTichSD)){
            System.out.println("nhập sai dịnh dạng, phải lớn hơn 30m2: ");
            dienTichSD = scanner.nextLine();
        }
        return dienTichSD;
    }

}
