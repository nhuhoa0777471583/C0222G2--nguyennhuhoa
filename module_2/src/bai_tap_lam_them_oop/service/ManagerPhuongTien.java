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



    public void display() {
        System.out.print("0.quay lai\n"
                +"1.Hien thi oto\n"+
                "2.Hien thixe máy\n"+
                "3.Hien thi xe tải");
        System.out.print("chọn chức năng: ");
        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                System.out.println("1 hien thi xe oto");

                break;
            case 2:
                System.out.println("2hien thi xe máy");
                break;
            case 3:
                System.out.println("3 hien thi xe tải");
                break;
            default:
                System.out.println("hết");
                break;

        }

    }

    public void add() {
            System.out.print("0.quay lai\n"
                    +"1.oto\n"+
                    "2.xe máy\n"+
                    "3.xe tải");
            System.out.print("chọn chức năng: ");
            int choose = scanner.nextInt();
            String[] a= new String[3];
            switch (choose){
                case 0:
                    TextPhuongTien.main(a);
                    break;
                case 1:
                    Oto oto=new Oto();
                    int tmp= 0;
                    for (int i = 0; i < phuongTien.length; i++) {
                        if(phuongTien[i] == null){
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
        }
}
