package bai_tap_case_study.controller;

import bai_tap_case_study.service.co_so_vat_chat_impl.CoSoVatChatServiceImpl;
import bai_tap_case_study.service.co_so_vat_chat_impl.HouseService;
import bai_tap_case_study.service.co_so_vat_chat_impl.RoomService;
import bai_tap_case_study.service.co_so_vat_chat_impl.VillaService;
import bai_tap_case_study.service.person_impl.KhachHangServiceImpl;
import bai_tap_case_study.service.person_impl.NhanVienServiceImpl;

import java.util.Scanner;

public class ControllerFurama {

    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        while (true) {
            System.out.println("Cac chuc nang:\n" +
                    "1.Quan li nhanh vien\n" +
                    "2.Quan li khanh hang\n" +
                    "3.Quan li co so\n" +
                    "4.Quan li đặt chổ\n" +
                    "5.khuyến mãi\n" +
                    "6.Exit\n");
            System.out.print("chon chuc nang: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    quanLiNhanVien();
                    break;
                case 2:
                    quanLiKhachHang();
                    break;
                case 3:
                    quanLiCoSo();
                    break;
                case 4:
                    quanLiDatTruoc();
                    break;
                case 5:
                    quanLiKhuyenMai();
                    break;
                case 6:
                   return;
                default:
                    System.out.println("-----chon sai roi nhap lai di------");
                    break;
            }
        }
    }

    //5
    private void quanLiKhuyenMai() {
        while (true) {
            System.out.println("---------");
            System.out.println("5-Quản lí khuyến mãi");
            System.out.println("-----");
            System.out.println("1.Hien thi danh sach KH su dung dich vu\n" +
                    "2.Danh sách hiển thị khách hàng nhận được voucher\n" +
                    "3.Trở lại menu chính\n");
            System.out.print("chon chuc nang: ");
            int choose5 = scanner.nextInt();
            switch (choose5) {
                case 1:
                    System.out.println("Hien thi danh sach KH su dung dich vu");
                    break;
                case 2:
                    System.out.println("Danh sách hiển thị khách hàng nhận được voucher");
                    break;
                case 3:
                    System.out.println("Trở lại menu chính");
                   return;
                default:
                case 0:
                    System.out.println("-----chon sai roi nhap lai di------");
                    break;
            }
        }
    }

    //4
    private void quanLiDatTruoc() {
        while (true) {
            System.out.println("---------");
            System.out.println("4-Quản lý đặt chỗ");
            System.out.println("-----");
            System.out.println("1.Thêm đặt chỗ mới\n" +
                    "2.Hiển thị danh sách đặt chỗ\n" +
                    "3.Tạo ra hợp đồng\n" +
                    "4.Hiển thị hợp đồng danh sách\n" +
                    "5.Sửa hợp đồng \n" +
                    "6.Trở lại menu chính\n");
            System.out.print("chon chuc nang: ");
            int choose4 = scanner.nextInt();
            switch (choose4) {
                case 1:
                    System.out.println("Thêm đặt chỗ mới");
                    break;
                case 2:
                    System.out.println("Hiển thị danh sách đặt chỗ");
                    break;
                case 3:
                    System.out.println("Tạo ra hợp đồng");
                    break;
                case 4:
                    System.out.println("Hiển thị hợp đồng danh sách ");
                    break;
                case 5:
                    System.out.println("Sửa hợp đồng");
                    break;
                case 6:
                    System.out.println("Trở lại menu chính");
                   return;
                default:
                case 0:
                    System.out.println("-----chon sai roi nhap lai di------");
                    break;
            }
        }
    }

    //3
    private void quanLiCoSo() {
        while (true) {
            System.out.println("3-Quản lý cơ sở:\n ");
            System.out.println("-----");

            System.out.println("1.Hiển thị danh sách cơ sở\n" +
                    "2.Thêm cơ sở mới\n" +
                    "3.Hiển thị danh sách bảo trì cơ sở\n" +
                    "4.Trở lại menu chính\n");
            System.out.print("chon chuc nang: ");
            int choose3 = scanner.nextInt();
            switch (choose3) {
                case 1:
                    System.out.println("Hiển thị danh sách cơ sở");
                    new CoSoVatChatServiceImpl().displayCoSo();
                    break;
                case 2:
                    System.out.println("Thêm cơ sở mới");
                    menuDichVu();
                    break;
                case 3:
                    System.out.println("Hiển thị danh sách bảo trì cơ sở");
                    break;
                case 4:
                    System.out.println("Trở lại menu chính");
                   return;
                default:
                case 0:
                    System.out.println("-----chon sai roi nhap lai di------");
                    break;
            }
        }
    }

    private void menuDichVu() {
        while (true) {
            System.out.println("---------");
            System.out.println("1.Add New Villa\n" +
                    "2.Add New House\n" +
                    "3.Add New Room\n" +
                    "4.thoát menu\n" +
                    "Moi chon chuc nang:");
            int choos = scanner.nextInt();
            switch (choos) {
                case 1:
                    System.out.println("You Chosse Add New Villa");
                    new VillaService().addNewVila();
                    break;
                case 2:
                    System.out.println("You Chosse Add New House");
                    new HouseService().addNewHouse();
                    break;
                case 3:
                    System.out.println("You Chosse Add New Room");
                    new RoomService().addNewRoom();
                    break;
                case 4:
                    System.out.println("---------thoat menu---------");
                   return;
                default:
                    System.out.println("------nhap lại-------");
                    break;
            }
        }
    }

    //2
    private void quanLiKhachHang() {
        while (true) {
            System.out.println("---------");
            System.out.println("2-Quản li khách hàng:");
            System.out.println("-----");
            System.out.println("1.Hiển thị danh sách khách hàng\n" +
                    "2.Thêm khách hàng mới\n" +
                    "3.Chỉnh sửa khách hàng\n" +
                    "4.Trở lại menu chính\n");
            System.out.print("chon chuc nang: ");
            int choose2 = scanner.nextInt();
            switch (choose2) {
                case 1:
                    System.out.println("Hiển thị danh sách khách hàng");
                    new KhachHangServiceImpl().display();
                    break;
                case 2:
                    System.out.println("Thêm khách hàng mới");
                    new KhachHangServiceImpl().add();
                    break;
                case 3:
                    System.out.println("Chỉnh sửa khách hàng");
                    new KhachHangServiceImpl().edit();
                    break;
                default:
                case 0:
                    System.out.println("-----chon sai roi nhap lai di------");
                    break;
                case 4:
                    System.out.println("Trở lại menu chính");
                  return;
            }
        }
    }

    //1
    private void quanLiNhanVien() {

        while (true) {
            System.out.println("---------");
            System.out.println("1-Quản lí nhân viên:");
            System.out.println("-----");
            System.out.println("1.Hiển thị danh sách nhân viên\n" +
                    "2.Thêm danh sách nhân viên\n" +
                    "3.Sửa danh sách nhân viên\n" +
                    "4.Trở lại menu chính\n");
            System.out.print("chon chuc nang: ");
            int choose1 = scanner.nextInt();
            switch (choose1) {
                case 1:
                    System.out.println("Hiển thị danh sách nhân viên");
                    new NhanVienServiceImpl().display();
                    break;
                case 2:
                    System.out.println("Thêm danh sách nhân viên");
                    new NhanVienServiceImpl().add();

                    break;
                case 3:
                    System.out.println("Sửa danh sách nhân viên");
                    new NhanVienServiceImpl().edit();
                    break;
                case 4:
                    System.out.println("Trở lại menu chính");
                    return;
                default:
                case 0:
                    System.out.println("-----chon sai roi nhap lai di------");
                    break;
            }
        }
    }
}
