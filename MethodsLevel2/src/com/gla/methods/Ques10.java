package com.gla.methods;

import java.util.Scanner;

public class Ques10 {
    public static double findBMI(double w, double h) {
        double hm = h / 100.0;
        return w / (hm * hm);
    }
    public static String getStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] arr = new double[10][3];
        String[] status = new String[10];
        for (int i = 0; i < 10; i++) {
            double w = sc.nextDouble();
            double h = sc.nextDouble();
            arr[i][0] = w;
            arr[i][1] = h;
            arr[i][2] = findBMI(w, h);
            status[i] = getStatus(arr[i][2]);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Weight: " + arr[i][0] + " Height: " + arr[i][1] + " BMI: " + arr[i][2] + " Status: " + status[i]);
        }
        sc.close();
        
    }
}