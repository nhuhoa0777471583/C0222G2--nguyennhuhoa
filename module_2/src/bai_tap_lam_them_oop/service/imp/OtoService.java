package bai_tap_lam_them_oop.service.imp;

import bai_tap_lam_them_oop.model.Oto;
import bai_tap_lam_them_oop.service.cac_interface.IOtoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OtoService implements IOtoService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Oto> otos = new ArrayList<>();

    static {
        otos.add(new Oto("111A", "honda", 2000, "hoa1", 10, "gia dinh"));
    }

    @Override
    public void themMoi() {
        System.out.print("them bien kiem soat: ");
        String bienKiemSoat = scanner.nextLine();

        System.out.print("them ten hang: ");
        String tenHang = scanner.nextLine();

        System.out.print("them nam san xuat:  ");
        int nam = Integer.parseInt(scanner.nextLine());

        System.out.print("them chu xe: ");
        String chu = scanner.nextLine();

        System.out.print("them so cho: ");
        int soChoNgoi = Integer.parseInt(scanner.nextLine());

        System.out.print("them kieu xe: ");
        String kieuXe = scanner.nextLine();

        Oto oto = new Oto(bienKiemSoat, tenHang, nam, chu, soChoNgoi, kieuXe);
        System.out.println(oto);
        otos.add(oto);
    }

    @Override
    public void hienThi() {
        for (Oto oto : otos) {
            System.out.println(oto);
        }
    }

    @Override
    public void xoa() {

    }

    @Override
    public void search() {

    }

    public static List<Oto> getOtos() {
        return otos;
    }
}
