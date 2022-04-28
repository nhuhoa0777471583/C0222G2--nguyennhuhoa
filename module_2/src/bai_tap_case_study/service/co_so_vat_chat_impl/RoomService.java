package bai_tap_case_study.service.co_so_vat_chat_impl;

import bai_tap_case_study.common.validate.RegexService;
import bai_tap_case_study.model.co_so_vat_chat.Room;
import bai_tap_case_study.service.interf.i_co_so_vat_chat.IRoom;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RoomService extends RegexService implements IRoom {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Integer, Room> room = new LinkedHashMap<>();

    //Room:String tenDichVu, String dienTichSuDung, String soLuongNguoi, String kieuThue,String dichVuFree

    @Override
    public void addNewRoom() {
        addInfoRoom();
    }

    @Override
    public void displayRoom() {
        Set<Map.Entry<Integer, Room>> roomSet = room.entrySet();
        for (Map.Entry<Integer, Room> r : roomSet) {
            System.out.println(r);
        }
    }

    private void addInfoRoom() {
        System.out.println("thêm ma dich vụ: ");
        String maDichVu = scanner.nextLine();
        regexMaDichVuRoom(maDichVu);
        System.out.print("them ten dich vu: ");
        String tenDichVu = scanner.nextLine();
//        regexTenDichVu(tenDichVu);
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
        System.out.print("them các dich vu free: ");
        String dichVuFree = scanner.nextLine();
        Room rooms1 = new Room(maDichVu, tenDichVu, chiPhiThue, dienTichSD, soLuongNguoi, kieuThue, dichVuFree);
        System.out.println(rooms1);
        room.put(2, rooms1);
    }
}
