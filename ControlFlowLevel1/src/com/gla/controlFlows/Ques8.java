package com.gla.controlFlows;
import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter countdown start number: ");
            int counter = sc.nextInt();

            while (counter >= 1) {
                System.out.println(counter);
                counter--;
            }
            System.out.println("Lift Off!");
        }
    }
}