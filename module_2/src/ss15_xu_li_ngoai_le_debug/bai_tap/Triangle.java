package ss15_xu_li_ngoai_le_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    private static void triangle(Integer a, Integer b, Integer c) throws IllegalTriangleException {

        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("ko phai tam giac");
        } else if ((a + b < c) || (a + c < b) || (b + c < a)) {
            System.out.println("khong la tam giac");
        } else {
            System.out.println("canh a: " + a);
            System.out.println("canh b: " + b);
            System.out.println("canh c: " + c);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.print("nhap canh a: ");
            int a = scanner.nextInt();
            System.out.print("nhap canh b: ");
            int b = scanner.nextInt();
            System.out.print("nhap canh c: ");
            int c = scanner.nextInt();
            try {
                Triangle.triangle(a, b, c);
                return;
            } catch (IllegalTriangleException e) {
                e.printStackTrace();
            }

        }
    }
}
