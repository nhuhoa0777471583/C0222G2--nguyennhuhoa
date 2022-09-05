import java.sql.Array;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Algorithm
//        261
//        int n = 10;
//        int sum = 0;
//        for (int i = 1; i < n; i++) {
//            if (check(i) || i == 1 || i == 2) {
//                sum += i;
//                System.out.println(i);
//            }
//        }
//        System.out.println(sum);
//       262
//        String a = "aabacsdcaaaa";
//        checkChar(a);

//263
//        int num = 100;
//        fibonacci(num);

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Mời nhập: ");

//        266
//        int decimal = scanner.nextInt();
//        String abc = Integer.toOctalString(decimal);
//        String OctalVal = checkOctal(decimal);
//        System.out.println(abc);
//        System.out.println("chuỗi 1: ");
//        String str1 = scanner.nextLine();
//        System.out.println("chuỗi 2: ");
//        String str2 = scanner.nextLine();
//        String str1 = "12:32:24";
//        String str2 = "25:61:61";
//        sumDate(str1,str2);
//        134
//        int[] arrInt = {1, 2, 5, 7, 8, 23};
//        int prime = 7;
//        int sum;
//        for (int i = 0; i < arrInt.length; i++) {
//            for (int j = 0; j < arrInt.length - 1; j++) {
//                sum = arrInt[i] + arrInt[j];
//                if (sum == prime) {
//                    System.out.println("số a: " + arrInt[i] + " số b: " + arrInt[j]);
//                    break;
//                }
//
//            }
//
//        }

        int a = 3;
        System.out.println(a);
        int b = a;
        System.out.println(b);

    }


    public static void sumDate(String str1, String str2) {
        String arr1[] = str1.split(":");
        String arr2[] = str2.split(":");
        String result = "";
        Integer h = Integer.parseInt(arr1[0]) + Integer.parseInt(arr2[0]);
        Integer m = Integer.parseInt(arr1[1]) + Integer.parseInt(arr2[1]);
        Integer s = Integer.parseInt(arr1[2]) + Integer.parseInt(arr2[2]);
        if (s >= 60) {
            m += 1;
            s = s - 60;
        }
        if (m >= 60) {
            h += 1;
            m = m - 60;
        }
        result = h + ":" + m + ":" + s;
        System.out.println(result);
    }


    public static String checkOctal(int number) {
        int numberVal;
        String octalNumber = "";
        char octalChar[] = {'0', '1', '2', '3', '4', '5', '6', '7'};
        for (; number > 0; number = number / 8) {
            numberVal = number % 8;
            octalNumber = octalChar[numberVal] + octalNumber;
        }
        return octalNumber;
    }


    public static void total(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }


    public static void prime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(number);
            }
        }
    }

    public static void fibonacci(int number) {
        int num1 = 0;
        int num2 = 1;
        System.out.println(num1 + "\n" + num2);
        int num3 = 0;
        for (int i = 0; i < number; i++) {
            if (i == num1 + num2) {
                num3 = i;
                num1 = num2;
                num2 = num3;
                System.out.println(num3);
            }

        }
    }


    public static void checkChar(String str) {

        int count[] = new int[255];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        char array[] = new char[str.length()];
//        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            array[i] = str.charAt(i);
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                if (array[i] == array[j]) {
                    System.out.println(sum++);
                }
            }
            if (sum == 1) {
                System.out.println(array[i] + " có: " + count[array[i]]++);
            }
        }
    }

    public static boolean check(int n) {
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }


}
