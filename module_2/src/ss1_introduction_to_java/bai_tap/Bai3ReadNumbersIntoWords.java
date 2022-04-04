package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Bai3ReadNumbersIntoWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter number : ");
        int num = sc.nextInt();

        int ones = num % 10;
        int tens = (num / 10) % 10;
        int hunderd = num / 100;

        if (0 <= num && num < 10) {
            switch (ones) {
                case 0:
                    System.out.print("zero");
                    break;
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
            }
        } else if (num < 20 && num >= 10) {
            switch (ones) {
                case 0:
                    System.out.print("ten");
                    break;
                case 1:
                    System.out.print("eleven");
                    break;
                case 2:
                    System.out.print("twelve");
                    break;
                case 3:
                    System.out.print("thirteen");
                    break;
                case 4:
                    System.out.print("fourteen");
                    break;
                case 5:
                    System.out.print("fifteen");
                    break;
                case 6:
                    System.out.print("sixteen");
                    break;
                case 7:
                    System.out.print("seventeen");
                    break;
                case 8:
                    System.out.print("eighteen");
                    break;
                case 9:
                    System.out.print("nineteen");
                    break;
            }

        } else if (num < 100 && num >= 20) {
            switch (tens) {
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("forty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
            }
            switch (ones) {
                case 1:
                    System.out.print("-one");
                    break;
                case 2:
                    System.out.print("-two");
                    break;
                case 3:
                    System.out.print("-three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("-five");
                    break;
                case 6:
                    System.out.print("-six");
                    break;
                case 7:
                    System.out.print("-seven");
                    break;
                case 8:
                    System.out.print("-eight");
                    break;
                case 9:
                    System.out.print("-nine");
                    break;
            }
        } else if (num >= 100 && num<1000) {
            switch (hunderd) {
                case 1:
                    System.out.print("one hundred");
                    break;
                case 2:
                    System.out.print("two hundred");
                    break;
                case 3:
                    System.out.print("three hundred");
                    break;
                case 4:
                    System.out.print("four hundred");
                    break;
                case 5:
                    System.out.print("five hundred");
                    break;
                case 6:
                    System.out.print("six hundred");
                    break;
                case 7:
                    System.out.print("seven hundred");
                    break;
                case 8:
                    System.out.print("eight hundred");
                    break;
                case 9:
                    System.out.print("nine hundred");
                    break;
            }
            switch (tens) {
                case 1:
                    System.out.print("-ten");
                    break;
                case 2:
                    System.out.print("-twenty");
                    break;
                case 3:
                    System.out.print("-thirty");
                    break;
                case 4:
                    System.out.print("-forty");
                    break;
                case 5:
                    System.out.print("-fifty");
                    break;
                case 6:
                    System.out.print("-sixty");
                    break;
                case 7:
                    System.out.print("-seventy");
                    break;
                case 8:
                    System.out.print("-eighty");
                    break;
                case 9:
                    System.out.print("-ninety");
                    break;
            }
            switch (ones) {
                case 1:
                    System.out.print("-one");
                    break;
                case 2:
                    System.out.print("-two");
                    break;
                case 3:
                    System.out.print("-three");
                    break;
                case 4:
                    System.out.print("-four");
                    break;
                case 5:
                    System.out.print("-five");
                    break;
                case 6:
                    System.out.print("-six");
                    break;
                case 7:
                    System.out.print("-seven");
                    break;
                case 8:
                    System.out.print("-eight");
                    break;
                case 9:
                    System.out.print("-nine");
                    break;
            }
        } else {
            System.out.println("over limit");
        }
    }
}





