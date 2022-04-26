package bai_tap_case_study.service.co_so_vat_chat_impl;

import bai_tap_case_study.model.co_so_vat_chat.FacilityFurama;
import bai_tap_case_study.model.co_so_vat_chat.House;
import bai_tap_case_study.model.co_so_vat_chat.Room;
import bai_tap_case_study.model.co_so_vat_chat.Villa;
import bai_tap_case_study.service.interf.ICoSoVatChatService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CoSoVatChatServiceImpl implements ICoSoVatChatService {
    protected static Scanner scanner = new Scanner(System.in);
    protected static Map<Integer,Room > room = new LinkedHashMap<>();
    protected static Map< Integer,Villa> villa = new LinkedHashMap<>();
    protected static Map< Integer,House> house = new LinkedHashMap<>();

    static {
        //Villa: String tenDichVu, String dienTichSuDung, String soLuongNguoi, String kieuThue,
        // String tieuChuanPhong, String dienTichHoBoi, String soTang
        villa.put(1,new Villa("thue phong", "50m2", "5 nguoi/phong", "thue theo gio", "vip", "50m2", "2 tang"));
        //Room:String tenDichVu, String dienTichSuDung, String soLuongNguoi, String kieuThue,String dichVuFree
        room.put(2,new Room("thue phong", "50m2", "5 nguoi/phong", "thue theo gio", "su dung dieu hoa free"));
       //Houser: String tenDichVu, String dienTichSuDung, String soLuongNguoi, String kieuThue,String tieuChuanPhong, String soTang
        house.put(3,new House("thue phong", "50m2", "5 nguoi/phong", "thue theo gio", "5 sao", "2 tang"));

    }

    @Override
    public void displayCoSo() {

      Set<Map.Entry<Integer, Room>> rooms= room.entrySet();
      Set<Map.Entry<Integer, Villa>> villas= villa.entrySet();
      Set<Map.Entry<Integer, House>> houses= house.entrySet();

        for (Map.Entry<Integer, Villa> v:villas) {
            System.out.println(v);
        }
        for (Map.Entry<Integer, Room> r:rooms) {
            System.out.println(r);
        }
        for (Map.Entry<Integer, House> h:houses) {
            System.out.println(h);
        }
    }
    @Override
    public void addNewVila() {
        System.out.print("them dich vu: ");
        String tenDichVu= scanner.nextLine();
        System.out.print("them dien tich su dung: ");
        String dienTichSD= scanner.nextLine();
        System.out.print("them so luong nguoi: ");
        String soLuongNguoi= scanner.nextLine();
        System.out.print("them kieu thue: ");
        String kieuThue= scanner.nextLine();
        System.out.print("them tieu chuan phong: ");
        String tieuChuanPhong= scanner.nextLine();
        System.out.print("them dien tich ho boi: ");
        String dienTichHoBoi= scanner.nextLine();
        System.out.print("them so tang: ");
        String soTang=scanner.nextLine();
        Villa villas1=new Villa(tenDichVu,dienTichSD,soLuongNguoi,kieuThue,tieuChuanPhong,dienTichHoBoi,soTang);
        System.out.println(villas1);
        villa.put(1,villas1);

    }

    @Override
    public void addNewRoom() {
        System.out.print("them dich vu: ");
        String tenDichVu= scanner.nextLine();
        System.out.print("them dien tich su dung: ");
        String dienTichSD= scanner.nextLine();
        System.out.print("them so luong nguoi: ");
        String soLuongNguoi= scanner.nextLine();
        System.out.print("them kieu thue: ");
        String kieuThue= scanner.nextLine();


        System.out.print("them ten dich vu: ");
        String dichVuFree=scanner.nextLine();
        Room rooms1=new Room(tenDichVu,dienTichSD,soLuongNguoi,kieuThue,dichVuFree);
        System.out.println(rooms1);
        room.put(2,rooms1);
    }


    @Override
    public void addNewHouse() {
        System.out.print("them dich vu: ");
        String tenDichVu= scanner.nextLine();
        System.out.print("them dien tich su dung: ");
        String dienTichSD= scanner.nextLine();
        System.out.print("them so luong nguoi: ");
        String soLuongNguoi= scanner.nextLine();
        System.out.print("them kieu thue: ");
        String kieuThue= scanner.nextLine();
        System.out.print("them tieu chuan phong: ");
        String tieuChuanPhong= scanner.nextLine();

        System.out.print("them so tang: ");
        String soTang= scanner.nextLine();

        House house1=new House(tenDichVu,dienTichSD,soLuongNguoi,kieuThue,tieuChuanPhong,soTang);
        System.out.println(house1);
        house.put(3,house1);
    }


    @Override
    public void displayBaoTri() {

    }
}
