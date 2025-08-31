package com.gla.methods;

public class Ques5 {
    public static double convertYardsToFeet(double y) { return y * 3; }
    public static double convertFeetToYards(double f) { return f * 0.333333; }
    public static double convertMetersToInches(double m) { return m * 39.3701; }
    public static double convertInchesToMeters(double i) { return i * 0.0254; }
    public static double convertInchesToCm(double i) { return i * 2.54; }

    public static void main(String[] args) {
        System.out.println(convertYardsToFeet(2));
        System.out.println(convertFeetToYards(6));
        System.out.println(convertMetersToInches(1));
        System.out.println(convertInchesToMeters(12));
        System.out.println(convertInchesToCm(10));
    }
}