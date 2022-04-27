package ss19_string_regex.bai_tap;

import java.util.Scanner;

public class ValidateClass {
    private static final String REGEX_CLASS = "^[C][0-9]{4}[GH]{1}[0-9]{1}$";
    //định dạng đúng của lớp:vd C0222G2
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("nhập tên lớp: ");
        String lop = scanner.nextLine();
        while (!(lop.matches(REGEX_CLASS))) {
            System.out.print("nhap lại ten lop: ");
            lop = scanner.nextLine();
        }
        System.out.print("tên lớp đúng định dạng: "+ lop);
    }
}
