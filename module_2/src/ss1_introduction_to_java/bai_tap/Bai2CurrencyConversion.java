package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Bai2CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double vnd;
        double dola;
        System.out.print("Enter dolla to exchange: ");
        dola= sc.nextDouble();
        vnd=dola*23000;
        System.out.print("VND be exchanged : "+ vnd);
    }
}
