package bai_tap_case_study.service.facility_impl;

import bai_tap_case_study.common.read_write.ReadAll;
import bai_tap_case_study.common.read_write.WriteAll;
import bai_tap_case_study.model.facility.House;
import bai_tap_case_study.service.interf.i_facility.IHouseSevice;

import java.util.*;

public class HouseService implements IHouseSevice {

    private static Scanner scanner = new Scanner(System.in);
    private static List<House> house = new ArrayList<>();

    static {
        WriteAll.writeHouse(house,false);
    }


    @Override
    public void addNewHouse() {
        addInfoHouse();
    }

    @Override
    public void dislayHouse() {
        house=ReadAll.readHouse();
        for(House h: house){
            System.out.println(h);
        }
    }

    private void addInfoHouse() {
        System.out.print("thêm mã dich vụ: ");
        String maDichVu = scanner.nextLine();
        // RegexService.regexMaDichVuVilla(maDichVu);
        System.out.print("them ten dich vu: ");
        String tenDichVu = scanner.nextLine();
        // RegexService.regexTenDichVu(tenDichVu);
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
        //   RegexService.regexKieuThue(kieuThue);
        System.out.print("them tieu chuan phong: ");
        String tieuChuanPhong = scanner.nextLine();
        //RegexService.regexTieuChuanPhong(tieuChuanPhong);
        System.out.print("them so tang: ");
        String soTang = scanner.nextLine();
       // RegexService.regexSoTang(soTang);
        House house1 = new House(maDichVu, tenDichVu, chiPhiThue, dienTichSD, soLuongNguoi, kieuThue, tieuChuanPhong, soTang);
        System.out.println(house1);
        house.add( house1);
        WriteAll.writeHouse(house,false);
    }


}
