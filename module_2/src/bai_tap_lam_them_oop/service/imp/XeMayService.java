package bai_tap_lam_them_oop.service.imp;

import bai_tap_lam_them_oop.model.Oto;
import bai_tap_lam_them_oop.model.XeMay;
import bai_tap_lam_them_oop.service.cac_interface.IXeMayService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMayService implements IXeMayService {
    private static Scanner scanner =new Scanner(System.in);
    private static List<XeMay> xeMays=new ArrayList<>();
    static {
        xeMays.add(new XeMay("222A","yamaha",2020,"hoaxemay","110cc"));
    }
    @Override
    public void themMoi() {

        System.out.print("them bien kiem soat: ");
        String bienKiemSoat=scanner.nextLine();

        System.out.print("them ten hang: ");
        String tenHang= scanner.nextLine();

        System.out.print("them nam san xuat: ");
        int nam=Integer.parseInt(scanner.nextLine());

        System.out.print("them chu xe: ");
        String chu= scanner.nextLine();

        System.out.print("them cong suat: ");
        String congSuat=scanner.nextLine();

        XeMay xeMay=new XeMay(bienKiemSoat,tenHang,nam,chu,congSuat);
        System.out.println(xeMay);
        xeMays.add(xeMay);

    }

    @Override
    public void hienThi() {
        for (XeMay xeMay:xeMays) {
            System.out.println(xeMay);
        }
    }

    @Override
    public void xoa() {

    }

    @Override
    public void search() {

    }

    public static List<XeMay> getXeMays() {
        return xeMays;
    }
}
