package bai_tap_lam_them_oop.service.imp;

import bai_tap_lam_them_oop.model.PhuongTien;
import bai_tap_lam_them_oop.service.cac_interface.IPhuongTienService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhuongTienService implements IPhuongTienService<PhuongTien> {
    private static Scanner sc = new Scanner(System.in);
    private static List<PhuongTien> phuongTienList = new ArrayList<>();

    static {
        phuongTienList.addAll(OtoService.getOtos());
        phuongTienList.addAll(XeTaiService.getXeTais());
        phuongTienList.addAll(XeMayService.getXeMays());
    }

    @Override
    public void themMoi() {

    }

    @Override
    public void hienThi() {
        for (PhuongTien phuongTien: phuongTienList) {
            System.out.println(phuongTien);
        }
    }

    @Override
    public void xoa() {
        System.out.print("nhap bien kiem soat: ");
        String bienKiemSoat = sc.nextLine();
        for (int i = 0; i < phuongTienList.size(); i++) {
            if (bienKiemSoat.equals(phuongTienList.get(i).getBienKiemSoat())) {
                phuongTienList.remove(i);
            }
        }
    }

    @Override
    public void search() {
        System.out.print("Nhap bien kiem soat: ");
        String bienKiemSoat = sc.nextLine();

        for (PhuongTien phuongTien: phuongTienList) {
            if (phuongTien.getBienKiemSoat().contains(bienKiemSoat)){
                System.out.println(phuongTien);
            }
        }
    }
}
