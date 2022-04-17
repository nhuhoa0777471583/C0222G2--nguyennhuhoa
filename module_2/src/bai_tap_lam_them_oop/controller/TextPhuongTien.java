package bai_tap_lam_them_oop.controller;

import bai_tap_lam_them_oop.service.ManagerPhuongTien;

import java.util.Scanner;

public class TextPhuongTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ManagerPhuongTien managerPhuongTien = new ManagerPhuongTien();
        boolean flag = true;

            System.out.print("Các chức năng:\n" +
                    "1:Thêm mới phương tiện\n" +
                    "2:Hiển thị phương tiện\n" +
                    "3:Xoá phương tiện\n" +
                    "4:Tìm kiếm theo biển kiểm soát\n" +
                    "5: Thoát\n");
            System.out.print("Chọn chức năng:");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("1.Thêm mới phương tiện");
                    managerPhuongTien.add();
                    break;
                case 2:
                    System.out.println("2.Hiển thị");
                    managerPhuongTien.display();
                    break;
                case 3:
                    System.out.println("3.Xoá");

                    break;
                case 4:
                    System.out.println("Tìm kiếm");
                    break;
                case 5:
                    System.out.println("Thoát");
                    break;
            }

    }

}
