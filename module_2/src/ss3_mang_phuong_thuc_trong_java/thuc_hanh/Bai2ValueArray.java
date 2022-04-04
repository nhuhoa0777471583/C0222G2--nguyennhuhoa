package ss3_mang_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class Bai2ValueArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila",
                "Sienna", "Tanya", "Connor", "Zachariah", "Mallory"};
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten can tim: ");
        String name = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.print("hoc sin cam tim  trong danh sach la " + name + "is:" + i);
                flag = true;
                break;
            }

        }
        if (!flag) {
            System.out.print("Not found" + name + " in the list.");
        }
    }
}
