package bai_tap_case_study.service.facility_impl;

import bai_tap_case_study.common.read_write.ReadAll;
import bai_tap_case_study.common.read_write.WriteAll;
import bai_tap_case_study.model.facility.Room;
import bai_tap_case_study.service.interf.i_facility.IRoomSevice;

import java.util.*;

public class RoomService implements IRoomSevice {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Room> room = new ArrayList<>();

    //String maDichVu,String tenDichVu, String chiPhi, String dienTichSuDung,
    //                String soLuongNguoi, String kieuThue,String dichVuFree
//    static {
//        room.add(new Room("1","11","111","111","111","111","111"));
//        room.add(new Room("2","22","22","22","22","22","22"));
//        room.add(new Room("3","33","33","33","33","33","33"));
//        WriteAll.writeRoom(room, false);
//    }

    @Override
    public void addNewRoom() {
        addInfoRoom();
    }

    @Override
    public void displayRoom() {
        room = ReadAll.readRoom();
        for (Room r : room) {
            System.out.println(r);
        }
    }

    private void addInfoRoom() {
        System.out.println("thêm ma dich vụ: ");
        String maDichVu = scanner.nextLine();
        //  RegexService.regexMaDichVuRoom(maDichVu);
        System.out.print("them ten dich vu: ");
        String tenDichVu = scanner.nextLine();
        // RegexService.regexTenDichVu(tenDichVu);
        System.out.print("them chi phi thue: ");
        String chiPhiThue = scanner.nextLine();
        //  RegexService.regexChiPhi(chiPhiThue);
        System.out.print("them dien tich su dung: ");
        String dienTichSD = scanner.nextLine();
        // RegexService.regexDienTichSD(dienTichSD);
        System.out.print("them so luong nguoi: ");
        String soLuongNguoi = scanner.nextLine();
        //  RegexService.regexSoLuongNguoi(soLuongNguoi);
        System.out.print("them kieu thue: ");
        String kieuThue = scanner.nextLine();
        // RegexService.regexKieuThue(kieuThue);
        System.out.print("them các dich vu free: ");
        String dichVuFree = scanner.nextLine();
        Room rooms = new Room(maDichVu, tenDichVu, chiPhiThue, dienTichSD, soLuongNguoi, kieuThue, dichVuFree);
        System.out.println(rooms);
        room.add( rooms);
        WriteAll.writeRoom(room, false);
    }
}
