package ss19_string_regex.bai_tap;

import java.util.Scanner;

public class ValidateNumberTelephone {
    private static Scanner scanner = new Scanner(System.in);
    private static final String REGEX_NUMBER = "^\\([0-9]{2}\\)\\-\\([0][0-9]{9}\\)$";

    public static void main(String[] args) {
        System.out.print("nhập số: ");
        String so = scanner.nextLine();
        while (!(so.matches(REGEX_NUMBER))) {
            System.out.print("số ko hợp lệ nhập lại: ");
            so = scanner.nextLine();
        }
        System.out.println("sdt đúng định dạng: " + so);
    }
}
