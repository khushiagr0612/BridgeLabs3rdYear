package com.gla.programmingelements;
import java.util.*;
public class Ques2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double base=sc.nextDouble();
        double height=sc.nextDouble();
        double areaInCM=0.5*base*height;
        double areaInInches=areaInCM*0.393701;
        System.out.println("Area of triangle in sq cm "+ areaInCM +" and insq inches "+ areaInInches);

    }
}
