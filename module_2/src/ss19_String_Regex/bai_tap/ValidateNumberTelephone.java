package ss19_String_Regex.bai_tap;

import java.util.Scanner;

public class ValidateNumberTelephone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^\\([0-9]{2}\\)\\-\\([0][0-9]{9}\\)";

            System.out.println("nhập số: ");
            String so = scanner.nextLine();
            System.out.println(so.matches(regex));
    }
}
