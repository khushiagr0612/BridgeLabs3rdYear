package com.gla.controlFlows;
import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter countdown start number: ");
            int counter = sc.nextInt();

            for (int i = counter; i >= 1; i--) {
                System.out.println(i);
            }
            System.out.println("Lift Off!");
        }
    }
}
