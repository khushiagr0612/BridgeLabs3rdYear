package com.gla.methods;

import java.util.Scanner;
public class Ques5 {
    public static boolean isSpring(int month, int day) {
        if((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20))
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        if(isSpring(month, day)) System.out.println("Its a Spring Season");
        else System.out.println("Not a Spring Season");
        sc.close();
    }
}