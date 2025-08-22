package com.gla.programmingelements;
import java.util.*;
public class Ques4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double dis=sc.nextDouble();
        double yards=dis/3;
        double miles=yards/1760;
        System.out.println("The dis in feet is "+dis+" while in yards is "+yards +" and in miles is "+miles);
    }

}