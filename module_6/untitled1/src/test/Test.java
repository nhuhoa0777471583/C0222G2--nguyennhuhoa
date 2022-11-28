package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String str = "LogiGear Vietnam";
        str = str.replaceAll("\\s+", "");

        char [] arr = new char[str.length()];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < str.length() ; i++) {
            arr[i] = str.charAt(i);
        }

    }


    static int i, j, k, c = 0, w;
    static char m;  //we can only define static for variables and fns not for arrays

    static void frequencycount(String s) {
        char[] z = new char[s.length()];
        for (w = 0; w < s.length(); w++)
            z[w] = s.charAt(w);
        for (i = 0; i < w; i++) {
            char ch = z[i];
            for (j = i + 1; j < w; j++) {
                if (z[j] == ch) {
                    for (k = j; k < (w - 1); k++)
                        z[k] = z[k + 1];
                    w--;
                    j = i;
                }
            }
        }

        int[] t = new int[w];
        for (i = 0; i < w; i++) {
            for (j = 0, c = 0; j < s.length(); j++) {
                if (z[i] == s.charAt(j))
                    c++;
            }
            t[i] = c;
            System.out.print(z[i] + "=" + c + ",");
        }
    }


//    public static void main(String[] args) {
//        System.out.println("Nhap chuoi : ");
//        System.out.println("Thinnch Qua Mon");
//        System.out.println("");
//        System.out.println("");
//        System.out.println("Ket qua :");
//        frequencycount("Thinnch Qua Mon");
//    }

}
