package com.gla.programmingelements;
import java.util.*;
public class Ques6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int quotient=x/y;
        int remainder=x%y;
        System.out.println(" The Quotient is "+quotient+ " and Reminder is "+remainder +" of two number "+x+" and "+y);
    }
}
