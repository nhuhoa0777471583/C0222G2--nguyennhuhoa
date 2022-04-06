package ss4_lop_va_doi_tuong.bai_tap;

import java.util.Scanner;

public class PhuongTrinhBacHai {
    double a;
    double b;
    double c;

    public PhuongTrinhBacHai() {

    }

    public PhuongTrinhBacHai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    public double getRoot1() {
        return (-b + Math.pow(b * b - 4 * a * c, 0.5)) / 2 * a;
    }

    public double getRoot2() {
        return (-b - Math.pow(b * b - 4 * a * c, 0.5)) / 2 * a;
    }

    public double getRoot() {
        return (-b / 2 * a);
    }

    public String display() {
        return "The equation has no roots";
    }
}

class MainPhuongTrinhBacHai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap a: ");
        double a = scanner.nextDouble();

        System.out.print("nhap b: ");
        double b = scanner.nextDouble();

        System.out.print("nhap c: ");
        double c = scanner.nextDouble();

        PhuongTrinhBacHai phuongTrinhBacHai = new PhuongTrinhBacHai(a, b, c);
        System.out.println("delta= " + phuongTrinhBacHai.getDiscriminant());

        if (phuongTrinhBacHai.getDiscriminant() > 0) {
            System.out.print("phuong trinh co 2 nghiem:\n " + "nghiem 1: " + phuongTrinhBacHai.getRoot1() + "\n" +
                    "nghiem 2: " + phuongTrinhBacHai.getRoot2());

        } else if (phuongTrinhBacHai.getDiscriminant() == 0) {
            System.out.print("pt co 1 nghiem : " + phuongTrinhBacHai.getRoot());
        } else {
            System.out.println(phuongTrinhBacHai.display());
        }
    }
}





