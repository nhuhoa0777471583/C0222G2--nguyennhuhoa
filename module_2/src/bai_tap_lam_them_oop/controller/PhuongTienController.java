package bai_tap_lam_them_oop.controller;

import bai_tap_lam_them_oop.model.Oto;
import bai_tap_lam_them_oop.model.PhuongTien;
import bai_tap_lam_them_oop.model.XeMay;
import bai_tap_lam_them_oop.model.XeTai;
import bai_tap_lam_them_oop.service.cac_interface.IPhuongTienService;
import bai_tap_lam_them_oop.service.cac_interface.IXeMayService;
import bai_tap_lam_them_oop.service.cac_interface.IXeTaiService;
import bai_tap_lam_them_oop.service.imp.OtoService;
import bai_tap_lam_them_oop.service.imp.PhuongTienService;
import bai_tap_lam_them_oop.service.imp.XeMayService;
import bai_tap_lam_them_oop.service.imp.XeTaiService;
import bai_tap_lam_them_oop.service.cac_interface.IOtoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhuongTienController {

    private static Scanner scanner = new Scanner(System.in);
    private static IOtoService iOtoService = new OtoService();
    private static IXeMayService iXeMayService=new XeMayService();
    private static IXeTaiService iXeTaiService=new XeTaiService();
    private static IPhuongTienService iPhuongTienService = new PhuongTienService();

    public void display() {
        while (true) {
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
                    chonLoaiXeCanThem();
                    break;
                case 2:
                    chonLoaiXeCanHienTHi();
                    break;
                case 3:
                    iPhuongTienService.xoa();
                    break;
                case 4:
                    iPhuongTienService.search();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }

    private void chonLoaiXeCanHienTHi() {
        System.out.println("2.Hiển thị");
        System.out.print("0-quay lai\n"
                + "1-oto\n" +
                "2-xe máy\n" +
                "3-xe tải\n" +
                "4-tat ca\n" );
        System.out.print("chọn chức năng: ");
        int choose2 = scanner.nextInt();
        switch (choose2) {
            case 1:
                System.out.println("xe oto");
                new OtoService().hienThi();
                break;
            case 2:
                System.out.println("xe máy");
                new XeMayService().hienThi();
                break;
            case 3:
                System.out.println("xe tải");
                new XeTaiService().hienThi();
                break;
            case 4:
                System.out.println("hien thi tat ca");
                iPhuongTienService.hienThi();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Nhap lai");
                break;
        }
    }

    private void chonLoaiXeCanThem() {
        System.out.print("Muon chon phuong tien nao them moi: \n"
                + "0-thoat\n"
                + "1-them moi oto\n"
                + "2-them moi xe máy\n"
                + "3-them moi xe tải\n");
        System.out.print("chọn chức năng: ");
        int choose1 = scanner.nextInt();
        switch (choose1) {
            case 1:
                System.out.println("1.hien thi xe oto");
                new OtoService().themMoi();
                break;
            case 2:
                System.out.println("2.hien thi xe máy");
                new XeMayService().themMoi();
                break;
            case 3:
                System.out.println("3.hien thi xe tải");
                new XeTaiService().themMoi();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("quay lai");
                break;
        }
    }
}

