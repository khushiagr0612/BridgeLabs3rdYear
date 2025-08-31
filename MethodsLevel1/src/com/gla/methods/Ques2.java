package com.gla.methods;

import java.util.Scanner;
public class Ques2 {
    public static int handshakes(int n) {
        return (n * (n - 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(handshakes(n));
    }
}