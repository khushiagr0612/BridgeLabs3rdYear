package com.gla.arrays;

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // physics, chemistry, maths
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1 ? "Chemistry" : "Maths");

                System.out.print(subject + ": ");
                int m = sc.nextInt();

                if (m < 0) {
                    System.out.println("Marks must be positive. Re-enter this student's marks.");
                    i--; 
                    break;
                }
                marks[i][j] = m;
            }
        }

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = (total / 300.0) * 100;

            if (percentage[i] >= 80) grade[i] = 'A';
            else if (percentage[i] >70) grade[i] = 'B';
            else if (percentage[i] > 60) grade[i] = 'C';
            else if (percentage[i] >50) grade[i] = 'D';
            else if (percentage[i]>40) grade[i]='E';
            else grade[i] = 'R';
        }

        System.out.println("\nResults:");
        System.out.printf("%-10s %-10s %-10s %-12s %-10s %-10s\n", "Physics", "Chemistry", "Maths", "Percentage", "Grade", "Student");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10d %-10d %-12.2f %-10c %-10d\n",
                    marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i], (i + 1));
        }
        sc.close();
    }
}
