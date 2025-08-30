package com.gla.string;

import java.util.Scanner;

public class Ques6 {

    public static void generateException(String text, int start, int end) {
        System.out.println(text.substring(start, end));
    }

    public static void handleException(String text, int start, int end) {
        try {
            System.out.println(text.substring(start, end));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter text: ");
            String text = sc.next();
            System.out.print("Enter start index: ");
            int start = sc.nextInt();
            System.out.print("Enter end index: ");
            int end = sc.nextInt();
            // generateException(text, end, start);
            handleException(text, end, start);
        }
    }
}