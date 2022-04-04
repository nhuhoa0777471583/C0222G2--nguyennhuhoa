package ss2_vong_lap_trong_java.bai_tap;

public class Bai3ShowPrimeLessThan100 {
    public static void main(String[] args) {
        int n = 2;
        System.out.println("prime numbers less than 100 :");
        while (n < 100) {
            boolean flag = true;
            if (n < 2) {
                flag = false;
                break;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                System.out.println(n);
            }
            n++;
        }
    }
}