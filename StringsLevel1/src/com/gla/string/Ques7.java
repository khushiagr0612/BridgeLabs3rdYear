package com.gla.string;
import java.util.Scanner;

public class Ques7 {

    public static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println("Number: " + num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number (string): ");
            String text = sc.next();
            // generateException(text);
            handleException(text);
        }
    }
}

