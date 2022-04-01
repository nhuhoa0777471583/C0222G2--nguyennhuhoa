package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double vnd,dola;
        System.out.println("nhap gia trị USD can doi: ");
        dola= sc.nextDouble();
        vnd=dola*23000;
        System.out.println("gia trị VND doi ra : "+ vnd);
    }
}
