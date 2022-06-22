package crudtaosan.controller;

import crudtaosan.service.impl.DienThoaiChinhHangService;
import crudtaosan.service.impl.DienThoaiXachTayService;

import java.util.Scanner;

public class ControllerDienThoai {
    private static Scanner scanner = new Scanner(System.in);
    private static DienThoaiChinhHangService dienThoaiChinhHangService = new DienThoaiChinhHangService();
    private static DienThoaiXachTayService dienThoaiXachTayService = new DienThoaiXachTayService();

    public static void displayMenu() {
        System.out.println("Chuong trinh quan li dien thoai");
        while (true) {
            try {
                System.out.println("chọn chức năng:\n" +
                        "1.thêm mới\n" +
                        "2.xoá\n" +
                        "3.xem danh sách\n" +
                        "4.tìm kiếm\n" +
                        "5.thoát\n" +
                        "chọn chức năng: ");
                int chosse = Integer.parseInt(scanner.nextLine());
                switch (chosse) {
                    case 1:
                        addDienThoai();
                        break;
                    case 2:
                        deleteDienThoai();
                        break;
                    case 3:
                        System.out.println("bạn chọn xem danh sách");
                        dienThoaiChinhHangService.display();
                        dienThoaiXachTayService.display();
                        break;
                    case 4:
                        searchDienThoai();
                        break;
                    case 5:
                        System.out.println("bạn chọn thoát");
                        break;
                    default:
                        throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("-----nhập sai so với menu, nhập lại------");
            }
        }
    }

    private static void searchDienThoai() {
        System.out.println("bạn chọn tìm kiếm");
        System.out.println("bạn chọn tìm kiếm\n" +
                "1.tìm kiếm điện thoại chính hãng\n" +
                "2.tìm kiếm điện thoại xách tay\n" +
                "3.trở về menu\n" +
                "chọn chức năng: ");
        int chosse2 = Integer.parseInt(scanner.nextLine());
        switch (chosse2) {
            case 1:
                System.out.println("bạn chọn tìm kiếm cho đt chính hãng");
                dienThoaiChinhHangService.search();
                break;
            case 2:
                System.out.println("bạn chọn tìm kiếm cho đt xách tay");
                dienThoaiXachTayService.search();
                break;
            case 3:
                System.out.println("bạn chọn trở về");
                displayMenu();
                break;
        }
    }

    private static void deleteDienThoai() {
        System.out.println("bạn xoá điện thoại\n" +
                "1.xoá cho điện thoại chính hãng\n" +
                "2.xoá cho điện thoại xách tay\n" +
                "3.trở về menu\n" +
                "chọn chức năng: ");
        int chosse2 = Integer.parseInt(scanner.nextLine());
        switch (chosse2) {
            case 1:
                System.out.println("bạn chọn xoá cho đt chính hãng");
                dienThoaiChinhHangService.delete();
                break;
            case 2:
                System.out.println("bạn chọn xoá cho đt xách tay");
                dienThoaiXachTayService.delete();
                break;
            case 3:
                System.out.println("bạn chọn trở về");
                displayMenu();
                break;
        }
    }

    private static void addDienThoai() {
        System.out.println("bạn chọn thêm mới\n" +
                "1.thêm cho đt chính hãng\n" +
                "2.thêm cho điện thoại xách tay\n" +
                "3.trở về menu\n" +
                "chọn chức năng: ");
        int chosse1 = Integer.parseInt(scanner.nextLine());
        switch (chosse1) {
            case 1:
                System.out.println("bạn chọn thêm cho đt chính hãng");
                dienThoaiChinhHangService.add();
                break;
            case 2:
                System.out.println("bạn chọn thêm cho đt xách tay");
                dienThoaiXachTayService.add();
                break;
            case 3:
                System.out.println("bạn chọn trở về");
                displayMenu();
                break;
        }
    }
}
