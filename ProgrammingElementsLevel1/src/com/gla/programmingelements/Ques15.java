package com.gla.programmingelements;
import java.util.*;
public class Ques15 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double unitPrice=sc.nextDouble();
        int quantity=sc.nextInt();
        double price=unitPrice*quantity;
        System.out.println("The total purchase price is INR " + price+" if the quantity is "+quantity+"  and unit price is INR "+unitPrice);
    }

}