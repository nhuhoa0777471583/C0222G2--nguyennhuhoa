package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Bai1Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter name : ");
        String name= sc.nextLine();

        System.out.print("Hello : " + name);
    }
}
