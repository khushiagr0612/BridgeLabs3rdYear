package com.gla.programmingelements;
import java.util.*;
public class Ques9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double fee=sc.nextDouble();
        double discount=sc.nextDouble();
        double discountAmount=(fee*discount)/100;
        double discountedPrice=fee-discountAmount;
        System.out.println(" The discount amount is INR " +discountAmount+" and final discounted fee is INR "+discountedPrice);
    }

}