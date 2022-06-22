package bai_tap_lam_them.bai_tap_lam_them_oop.service.imp;

import bai_tap_lam_them.bai_tap_lam_them_oop.model.XeTai;
import bai_tap_lam_them.bai_tap_lam_them_oop.service.cac_interface.IXeTaiService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeTaiService implements IXeTaiService {
    private static Scanner scanner =new Scanner(System.in);
    private static List<XeTai> xeTais=new ArrayList<>();
    static {
        xeTais.add(new XeTai("333A","toyota",3000,"hoaxetai","1100T"));
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

            System.out.print("them trong tai");
            String trongTai= scanner.nextLine();

            XeTai xeTai1= new XeTai(bienKiemSoat,tenHang,nam,chu,trongTai);
            System.out.println(xeTai1);
            xeTais.add(xeTai1);


    }

    @Override
    public void hienThi() {
        for (XeTai xeTai:xeTais) {
            System.out.print(xeTai);
        }
    }

    @Override
    public void xoa() {

    }

    @Override
    public void search() {

    }

    public static List<XeTai> getXeTais() {
        return xeTais;
    }
}
