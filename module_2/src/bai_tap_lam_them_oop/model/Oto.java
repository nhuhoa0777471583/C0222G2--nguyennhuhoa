package bai_tap_lam_them_oop.model;

import bai_tap_lam_them_oop.controller.TextPhuongTien;

import java.util.Scanner;

public class Oto extends PhuongTien {
    private int soChoNgoi;
    private String kieuXe;


    public Oto(){}

    public Oto(int bienKiemSoat, String tenHang,int namSanXuat, String chuSoHuu,int soChoNgoi,String kieuXe){
        super(bienKiemSoat, tenHang, namSanXuat, chuSoHuu);
        this.soChoNgoi=soChoNgoi;
        this.kieuXe=kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Oto: " +
                "soChoNgoi= " + soChoNgoi +
                ", kieuXe= " + kieuXe + '\'' +super.toString();
    }
    public Oto addOto(){
        Scanner scanner =new Scanner(System.in);
        System.out.print("them bien kiem soat");
        int bienKiemSoat=Integer.parseInt(scanner.nextLine());

        System.out.print("them ten hang: ");
        String tenHang= scanner.nextLine();

        System.out.print("them nam san xuat");
        int nam=Integer.parseInt(scanner.nextLine());

        System.out.print("them chu xe: ");
        String chu= scanner.nextLine();

        System.out.print("them so cho");
        int soChoNgoi=Integer.parseInt(scanner.nextLine());

        System.out.print("them kieu xe: ");
        String kieuXe= scanner.nextLine();

        Oto oto =new Oto(bienKiemSoat,tenHang,nam,chu,soChoNgoi,kieuXe);

        return oto;
    }
}
