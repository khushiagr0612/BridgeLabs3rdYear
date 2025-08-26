package com.gla.controlFlows;
import java.util.Scanner;

public class Ques12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            if (n > 0) {
                int sumLoop = 0, i = 1;
                while (i <= n) {
                    sumLoop += i;
                    i++;
                }

                int sumFormula = n * (n + 1) / 2;

                System.out.println("Sum using while loop: " + sumLoop);
                System.out.println("Sum using formula: " + sumFormula);

                if (sumLoop == sumFormula) {
                    System.out.println("Both computations are correct.");
                } else {
                    System.out.println("Mismatch in computations!");
                }
            } else {
                System.out.println("The number " + n + " is not a natural number.");
            }
        }
    }
}
