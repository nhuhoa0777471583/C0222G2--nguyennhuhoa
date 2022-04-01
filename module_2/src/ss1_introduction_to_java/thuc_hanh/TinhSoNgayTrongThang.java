package ss1_introduction_to_java.thuc_hanh;
import jdk.nashorn.internal.ir.Symbol;

import java.util.Scanner;
public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so thang: ");
        int thang = sc.nextInt();
        String ngayTrongThang;
        switch (thang) {
            case 2:
//                System.out.println(" thang"+ thang +" co 28 or 29 ngay");
                ngayTrongThang ="28 or 29 ";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
                ngayTrongThang ="  31 ";
                break;
            case 4:
            case 6:
            case 9:
            case 12:
                ngayTrongThang =" 30 ";
                break;
            default:
                ngayTrongThang ="";
        }
        if(ngayTrongThang!=""){
            System.out.printf(" thang '%d' co %s ngay! ",thang,ngayTrongThang);
        }
        else   {
            System.out.println("khong dung!!");
        }
    }
}
