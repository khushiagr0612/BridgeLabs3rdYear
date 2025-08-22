package com.gla.programmingelements;
import java.util.*;
public class Ques10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double heightInCM=sc.nextDouble();
        double inch=heightInCM/2.54;
        double feet=inch/12;
        System.out.println("Your Height in cm is "+ heightInCM+" while in feet is "+feet +" and inches is "+inch);

    }

}