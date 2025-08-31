package com.gla.methods;

import java.util.Scanner;

public class Ques9 {
    public static boolean isPositive(int n) { return n > 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static int compare(int a, int b) {
        if (a == b) return 0;
        return a > b ? 1 : -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) arr[i] = sc.nextInt();
        for (int n : arr) {
            if (isPositive(n)) {
                System.out.print(n + " is Positive and ");
                System.out.println(isEven(n) ? "Even" : "Odd");
            } else if (n < 0) System.out.println(n + " is Negative");
            else System.out.println("Zero");
        }
        System.out.println("Compare first and last: " + compare(arr[0], arr[4]));
    }
}
