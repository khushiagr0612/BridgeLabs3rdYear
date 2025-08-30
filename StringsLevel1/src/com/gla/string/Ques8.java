package com.gla.string;

import java.util.Scanner;

public class Ques8 {

    public static void generateException(String[] arr, int index) {
        System.out.println(arr[index]);
    }

    public static void handleException(String[] arr, int index) {
        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter array size: ");
            int size = sc.nextInt();
            String[] arr = new String[size];
            System.out.println("Enter elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.next();
            }
            System.out.print("Enter index to access: ");
            int index = sc.nextInt();
            // generateException(arr, index);
            handleException(arr, index);
        }
    }
}