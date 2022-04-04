package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class Bai2Show20PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter numbers:");
        num = sc.nextInt();
        int count = 0;
        int n = 2;
        while (count < num) {
            boolean flag = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(n + " is Prime ");
                count++;
            }
            n++;
        }
    }
}
