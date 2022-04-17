package bai_tap_lam_them_oop.service;

import bai_tap_lam_them_oop.model.Oto;
import bai_tap_lam_them_oop.model.PhuongTien;
import bai_tap_lam_them_oop.model.XeMay;
import bai_tap_lam_them_oop.model.XeTai;
import bai_tap_lam_them_oop.controller.TextPhuongTien;

import java.util.List;
import java.util.Scanner;

public class ManagerPhuongTien {
    Scanner scanner = new Scanner(System.in);
    static PhuongTien[] phuongTien = new PhuongTien[5];
    static Oto[] oto = new Oto[5];
    static XeMay[] xeMay = new XeMay[5];
    static XeTai[] xeTai = new XeTai[5];

    static {
        oto[0] = new Oto(444, "mada", 2000, "hoa1", 9, "gia dinh");
        xeMay[0] = new XeMay(333, "mada", 2000, "hoa1", "110cc");
        xeTai[0] = new XeTai(555, "mada", 2000, "hoa1", 1000);
    }


    public void display() {
        System.out.print("0.quay lai\n"
                + "1.Hien thi oto\n" +
                "2.Hien thixe máy\n" +
                "3.Hien thi xe tải\n");
        System.out.print("chọn chức năng: ");
        int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("1 hien thi xe oto");
                    for (int i = 0; i < oto.length; i++) {
                        if (oto[i] != null) {
                            System.out.println(oto[i].toString());
                        }
                    }
                    break;
                case 2:
                    System.out.println("2hien thi xe máy");
                    for (int i = 0; i < xeMay.length; i++) {
                        if (xeMay[i] != null) {
                            System.out.println(xeMay[i].toString());
                        }
                    }
                    break;
                case 3:
                    System.out.println("3 hien thi xe tải");
                    for (int i = 0; i < xeTai.length; i++) {
                        if (xeTai[i] != null) {
                            System.out.println(xeTai[i].toString());
                        }
                    }
                    break;
                default:
                    System.out.println("hết");
                    break;
            }
    }
    public void add() {
        System.out.print("0.quay lai\n"
                + "1.oto\n" +
                "2.xe máy\n" +
                "3.xe tải\n");
        System.out.print("chọn chức năng: ");
        int choose = scanner.nextInt();
        String[] a = new String[3];
        boolean flag = true;
        do {
            switch (choose) {
                case 1:
                    Oto oto = new Oto();
                    int tmp = 0;
                    for (int i = 0; i < phuongTien.length; i++) {
                        if (phuongTien[i] == null) {
                            tmp = i;
                            break;
                        }
                    }
                    phuongTien[tmp] = oto.addOto();
                    TextPhuongTien.main(a);
                    break;
                case 2:
                    System.out.println("xe máy");
                    break;
                case 3:
                    System.out.println("xe tải");
                    break;
                default:
                    System.out.println("hết");
                    break;
            }
        }while (flag);
    }
}
