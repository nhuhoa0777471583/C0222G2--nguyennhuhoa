package ss1_introduction_to_java.thuc_hanh;
import java.util.Scanner;
public class TinhDienTich {
    public static void main(String[] args) {
        float rong ,cao;
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap chieu rong: ");
        rong=sc.nextFloat();
        System.out.println("nhap chieu cao:");
        cao=sc.nextFloat();
        float area =rong *cao;
        System.out.println("area= "+ area);
    }
}
