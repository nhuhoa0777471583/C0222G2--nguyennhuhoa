package crudtaosan.service.impl;

import crudtaosan.common.NotFoudProductException;
import crudtaosan.common.readwrite.Read;
import crudtaosan.common.readwrite.Write;
import crudtaosan.model.DienThoaiChinhHang;
import crudtaosan.model.DienThoaiXachTay;
import crudtaosan.service.IDienThoaiChinhHang;
import crudtaosan.service.IService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DienThoaiChinhHangService implements IDienThoaiChinhHang {
    private static Scanner scanner = new Scanner(System.in);
    private static List<DienThoaiChinhHang> dienThoaiChinhHangList = new ArrayList<>();


    //    static {
//        dienThoaiChinhHangList.add(new DienThoaiChinhHang(1, "iphone", 1000, 10,
//                "ios", 10, "danang"));
//        dienThoaiChinhHangList.add(new DienThoaiChinhHang(2, "andr", 1000, 2,
//                "abc", 10, "toanquoc"));
//        dienThoaiChinhHangList.add(new DienThoaiChinhHang(3, "xiami", 1000, 3,
//                "tq", 10, "hanoi"));
//        Write.writeDienThoaiChinhHang(dienThoaiChinhHangList, true);
//    }
//        for (int i = 0; i < dienThoaiChinhHangList.size(); i++) {
//            id = dienThoaiChinhHangList.get(i).getId() + 1;
//
//        }
    @Override
    public void add() {
        dienThoaiChinhHangList = Read.readDienThoaiChinhHang();
        System.out.println("nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên điện thoại: ");
        String tenDienThoai = scanner.nextLine();
        System.out.println("nhập giá bán: ");
        int giaBan = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập số lượng: ");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên nhà sản xuất: ");
        String nhaSanXuat = scanner.nextLine();
        System.out.println("nhập thời gian bảo hành: ");
        int thoiGianBaoHanh = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập phạm vi bảo hành: ");
        String phamVi = scanner.nextLine();
        DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(id, tenDienThoai, giaBan, soLuong, nhaSanXuat, thoiGianBaoHanh, phamVi);
        System.out.println(dienThoaiChinhHang);
        dienThoaiChinhHangList.add(dienThoaiChinhHang);
        Write.writeDienThoaiChinhHang(dienThoaiChinhHangList, false);
    }

    @Override
    public void display() {
        dienThoaiChinhHangList = Read.readDienThoaiChinhHang();
        for (DienThoaiChinhHang dt : dienThoaiChinhHangList) {
            System.out.println(dt);
        }
    }

    @Override
    public void delete() {
        dienThoaiChinhHangList = Read.readDienThoaiChinhHang();
        boolean flag = false;
        System.out.println("nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < dienThoaiChinhHangList.size(); i++) {
            if (id == dienThoaiChinhHangList.get(i).getId()) {
                flag = true;
                System.out.println("bạn muốn xoá không?\n" +
                        "1.yes\n" +
                        "2.no\n" +
                        "chọn chức năng: ");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("bạn chọn xoá");
                        System.out.println("bạn đã xoá id: " + dienThoaiChinhHangList.remove(i).getId());
                        break;
                    case 2:
                        System.out.println("bạn đã ko xoá");
                        return;
                }
            }
        }
        if (flag == false) {
            try {
                throw new NotFoudProductException();
            } catch (NotFoudProductException e) {
                e.getMessage();
            }
        }
        Write.writeDienThoaiChinhHang(dienThoaiChinhHangList, true);

    }

    @Override
    public void search() {
        dienThoaiChinhHangList = Read.readDienThoaiChinhHang();
        checkTenDienThoai();
        Write.writeDienThoaiChinhHang(dienThoaiChinhHangList, true);
    }

    private void checkTenDienThoai() {
        boolean flag = false;
        System.out.println("nhập tên điện thoại: ");
        String tenDienThoai = scanner.nextLine();
        for (int i = 0; i < dienThoaiChinhHangList.size(); i++) {
            if (dienThoaiChinhHangList.get(i).getTenDienThoai().contains(tenDienThoai)) {
                flag = true;
                System.out.println("có tên đt đó trong ds là đt : " + dienThoaiChinhHangList.get(i).getTenDienThoai());
                break;
            }
        }
        if (flag == false) {
            System.out.println("ko có tên đt trong ds");
        }
    }
}

