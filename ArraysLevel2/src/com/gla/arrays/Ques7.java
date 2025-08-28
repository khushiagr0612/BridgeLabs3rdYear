package com.gla.arrays;

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; // [weight, height, BMI]
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            double weight, height;

            do {
                System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
                weight = sc.nextDouble();
                if (weight <= 0) System.out.println("Weight must be positive. Try again.");
            } while (weight <= 0);

            do {
                System.out.print("Enter height (m) of person " + (i + 1) + ": ");
                height = sc.nextDouble();
                if (height <= 0) System.out.println("Height must be positive. Try again.");
            } while (height <= 0);

            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = weight / (height * height);

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nResults:");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height", "Weight", "BMI", "Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                    personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
        sc.close();
    }
}

