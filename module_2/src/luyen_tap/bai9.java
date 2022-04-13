package luyen_tap;


import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ms = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print(" MSSV thu " + (i + 1) + ": ");
            ms[i] = scanner.nextLine();
        }
        for (int i = 0; i < ms.length; i++) {
            if (!ms[i].matches("B170[1-9]{4}")) {
                System.out.println("sai roi");
            }
        }
    }
}
