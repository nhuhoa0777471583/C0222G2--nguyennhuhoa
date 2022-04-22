package ss15_xu_li_ngoai_le_debug.bai_tap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("nhap canh a: ");
            int a = scanner.nextInt();
            System.out.print("nhap canh b: ");
            int b = scanner.nextInt();
            System.out.print("nhap canh c: ");
            int c = scanner.nextInt();
            tamGiac(a, b, c);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.err.println("loi roi!!!");
        }
    }

    private static void tamGiac(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("canh nho hon khong");
        } else if ((a + b < c) || (a + c < b) || (b + c < a)) {
            throw new IllegalTriangleException("2 cach nho hon 1 canh");
        } else {
            System.out.println("la tam giac");
            System.out.println(chuVi(a, b, c));
        }
    }

    public static int chuVi(int a , int b, int c){
        int chuVi=(a+b+c);
        return chuVi;
    }
}
