package com.example.demo;

public class test {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (check(i) == true) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static boolean check(int n) {
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (n % i == 0) {
                flag = false;
            } else {
                flag = true;
            }
        }
        return flag;
    }
}
