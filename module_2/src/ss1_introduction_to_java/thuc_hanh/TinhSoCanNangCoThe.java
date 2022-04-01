package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class TinhSoCanNangCoThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double canNang, chieuCao;
        System.out.print("nhap can nang :");
        canNang = sc.nextDouble();

        System.out.print("nhap chieu cao :");
        chieuCao = sc.nextDouble();

        double BMI = canNang / (chieuCao * chieuCao);
        System.out.printf("BMI="+BMI +'\n');

        if (BMI < 18.5) {
            System.out.println("tot");
        } else if (BMI < 25) {
            System.out.println("binh thuong!");
        } else if (BMI < 30) {
            System.out.println("khong on roi !");
        } else {
            System.out.println("beo lam giam can di");
        }
    }
}
