package com.gla.methods;

import java.util.Scanner;

public class Ques3 {
    public static boolean isLeap(int year) {
        if (year < 1582) return false;
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(isLeap(year));
        sc.close();
    }
}