package ss4_lop_va_doi_tuong.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("nhap chieu rong: ");
        double width= scanner.nextDouble();

        System.out.print("nhap chieu cao:  ");
        double height=scanner.nextDouble();

        HinhChuNhat hinhChuNhat=new HinhChuNhat(width,height);
        System.out.println(hinhChuNhat.display());
        System.out.println("chu vi hinh chu nhat: "+hinhChuNhat.getPerimeter());
        System.out.println("dien tich : "+hinhChuNhat.getArea());
    }
}
