package bai_tap_lam_them.bai_tap_lam_them2.controller;

import java.util.Scanner;

public class MenuTKB {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
        while (true) {
            try {
                System.out.println("thời khoá biểu");
                System.out.println("Các chức năng:\n" +
                        "1. Danh sách toàn bộ các công việc trong tuần\n" +
                        "2. Thêm mới công việc\n" +
                        "3. Cập nhật\n" +
                        "4. Thoát\n" +
                        "Chọn chức năng: ");
                int chosse = Integer.parseInt(scanner.nextLine());
                switch (chosse) {
                    case 1:
                        System.out.println("Bạn chọn hiển thị danh sách công việc");
                        System.out.println("có 2 tuỳ chọn để hiển thị:" +
                                "a. Hiển thị theo Mức độ ưu tiên\n" +
                                "b. Hiển thị theo Thứ\n");
                        int chosse1 = Integer.parseInt(scanner.nextLine());
                        switch (chosse1) {
                            case 1:
                                System.out.println("Bạn chọn hiển thị theo Mức độ ưu tiên");
                                break;
                            case 2:
                                System.out.println("Bạn chọn hiển thị theo thứ");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Bạn chọn thêm mới công việc công việc");
                        break;
                    case 3:
                        System.out.println("Bạn chọn Cập nhật");
                        break;
                    case 4:
                        System.out.println("Bạn chọn thoát");
                        System.exit(0);
                        break;
                    default:
                        throw new Exception();
                }
            }catch (Exception e){
                System.out.println("nhập lại: ");
            }
        }
    }
}
