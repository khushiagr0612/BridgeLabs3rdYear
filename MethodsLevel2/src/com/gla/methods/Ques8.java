package com.gla.methods;

import java.util.Scanner;

public class Ques8 {
    public static int youngest(int[] ages) {
        int min = ages[0];
        for (int a : ages) if (a < min) min = a;
        return min;
    }
    public static int tallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) if (h > max) max = h;
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3], heights = new int[3];
        for (int i = 0; i < 3; i++) ages[i] = sc.nextInt();
        for (int i = 0; i < 3; i++) heights[i] = sc.nextInt();
        System.out.println("Youngest age: " + youngest(ages));
        System.out.println("Tallest height: " + tallest(heights));
        sc.close();
    }
}