package crud_mau.controller;

import crud_mau.service.impl.CGVService;

import java.util.Scanner;

public class ControllerCGV {
    private static Scanner sc = new Scanner(System.in);
    private static CGVService cgv = new CGVService();

    public void displayMenu() {
        System.out.println("CGV XIN CHÀO!!");
        while (true) {
            try {
                System.out.println("----");
                System.out.println("1.Danh sách toàn bộ suất chiếu của rạp\n" +
                        "2.Thêm mới một suất chiếu\n" +
                        "3.Xoá suất chiếu bất kì theo Mã suất chiếu, trước khi xoá thì cần hiển thị confirm.\n" +
                        "4.Thoát\n" +
                        "Chọn chức năng: ");

                int choose = sc.nextInt();
                switch (choose) {
                    case 1:
                        System.out.println("Bạn chọn hiển thị danh sách xuất chiếu");
                        cgv.display();
                        break;
                    case 2:
                        System.out.println("Bạn chọn thêm mới xuất chiếu");
                        cgv.add();
                        break;
                    case 3:
                        System.out.println("Bạn chọn xoá xuất chiếu");
                        cgv.delete();
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("nhập sai với menu, nhâp lại: ");
            }
        }
    }
}
