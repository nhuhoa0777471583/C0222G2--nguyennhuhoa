package ss19_String_Regex.bai_tap;

import java.util.Scanner;

public class ValidateClass {
    public static void main(String[] args) {

        String regex = "^[CAP][0-9]{4}[GHIKLM]{1}$";
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("nhap ten lop: ");
            String lop = scanner.nextLine();
            System.out.println(lop.matches(regex));
        }
    }
}
