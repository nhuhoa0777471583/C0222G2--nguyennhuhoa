package bai_tap_lam_them.bai_tap_them_123.controller;

import bai_tap_lam_them.bai_tap_them_123.model.Teacher;
import bai_tap_lam_them.bai_tap_them_123.service.StudentService;
import bai_tap_lam_them.bai_tap_them_123.service.TeacherService;

import java.util.Scanner;

public class ControllerStudent {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentService studentService = new StudentService();
    private static TeacherService teacherService = new TeacherService();

    public void displayMenu() {
        while (true) {
            try {
                System.out.println("===CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN====");
                System.out.println("Chọn chức năng\n" +
                        "1.Thêm mới giảng viên hoặc học sinh\n" +
                        "2.Xóa giảng viên hoặc học sinh\n" +
                        "3.Xem danh sách giảng viên hoặc học sinh\n" +
                        "4.Tìm kiếm giảng viên hoặc học sinh\n" +
                        "5.Thoát\n" +
                        "Chọn chức năng:\n");
                int chosse = Integer.parseInt(scanner.nextLine());
                switch (chosse) {
                    case 1:
                        while (true) {
                            System.out.println("bạn chọn thêm giảng vien hoặc học sinh");
                            System.out.println("1.thêm giảng viên\n" +
                                    "2.thêm học sinh\n" +
                                    "3.trở lại menu\n" +
                                    "chọn: ");
                            int choose1 = Integer.parseInt(scanner.nextLine());
                            switch (choose1) {
                                case 1:
                                    System.out.println("bạn chọn thêm giảng viên");
                                    teacherService.add();
                                    break;
                                case 2:
                                    System.out.println("bạn chọn thêm học sinh");
                                    studentService.add();
                                    break;
                                default:
                                    System.out.println("nhập lại");
                                    break;
                                case 3:
                                    displayMenu();
                            }
                        }

                    case 2:
                        System.out.println("bạn chọn Xóa giảng viên hoặc học sinh");
                        studentService.delete();
                        break;
                    case 3:
                        while (true) {
                            System.out.println("bạn chọn Xem danh sách giảng viên hoặc học sinh");
                            System.out.println("1.xem giảng viên\n" +
                                    "2.xem học sinh\n" +
                                    "3.trở lại menu\n" +
                                    "chọn: ");
                            int choose2 = Integer.parseInt(scanner.nextLine());
                            switch (choose2) {
                                case 1:
                                    System.out.println("bạn chọn xem giảng viên");
                                    teacherService.display();
                                    break;
                                case 2:
                                    System.out.println("bạn chọn xem học sinh");
                                    studentService.display();
                                    break;
                                default:
                                    System.out.println("nhập lại");
                                    break;
                                case 3:
                                    displayMenu();
                            }
                        }
                    case 4:
                        System.out.println("bạn chọn Tìm kiếm giảng viên hoặc học sinh");
                        break;
                    case 5:
                        System.out.println("bạn chọn thoát");
                        System.exit(0);
                        break;
                    default:
                        throw  new Exception();
                }
            }catch (Exception e){
                System.out.println("ko dc bỏ trống");
            }
        }
    }
}
