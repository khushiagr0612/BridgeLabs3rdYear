package com.gla.string;

import java.util.Random;
import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);
        String[][] eligibility = checkVotingEligibility(ages);

        displayEligibility(eligibility);
        sc.close();
    }

    // Generate random 2-digit ages for n students
    static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = 10 + rand.nextInt(90); // ensures 2-digit age (10–99)
        }
        return ages;
    }

    // Check eligibility and return 2D array [age, canVote]
    static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);
            if (age < 0) {
                result[i][1] = "false";
            } else if (age >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    // Display results in tabular format
    static void displayEligibility(String[][] data) {
        System.out.println("\nStudent Age\tCan Vote?");
        System.out.println("---------------------------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}
