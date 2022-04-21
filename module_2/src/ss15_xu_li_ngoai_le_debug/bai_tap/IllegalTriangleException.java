package ss15_xu_li_ngoai_le_debug.bai_tap;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.print("nhap canh a: ");
        a = scanner.nextInt();
        System.out.print("nhap canh b: ");
        b = scanner.nextInt();
        System.out.print("nhap canh c: ");
        c = scanner.nextInt();
        triangle(a, b, c);


    }

    private static void triangle(int a, int b, int c) {
        try {
            if (a <= 0 || b <= 0 || c <= 0) {
                System.out.println("khong la tam giac");
            } else if ((a + b < c) || (a + c < b) || (b + c < a)) {
                System.out.println("khong la tam giac");
            } else {
                System.out.println("canh a: " + a);
                System.out.println("canh b: " + b);
                System.out.println("canh c: " + c);
            }

        }catch (Exception e ){}
    }
}
