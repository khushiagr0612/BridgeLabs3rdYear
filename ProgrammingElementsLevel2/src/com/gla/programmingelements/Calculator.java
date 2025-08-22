package com.gla.programmingelements;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        int z=sc.nextInt();
        Calculator2 cal=new Calculator2();
        if(z==1) {
            cal.add(x, y);
        }else if(z==2) {
            cal.sub(x, y);
        }else if(z==3) {
            cal.mul(x, y);
        }else if(z==4) {
            cal.div(x, y);
        }else {
            System.out.println("Invalid Input");
        }
    }

}
class Calculator2{
    public void add (int a, int b) {
        System.out.println("Addition = "+ (a+b));
    }
    public void sub(int a, int b) {
        System.out.println("Substraction = "+(a-b));
    }
    public void mul(int a,int b) {
        System.out.println("Multiplication = " +(a*b));
    }
    public void div(int a,int b) {
        System.out.println("Division = "+ (a/b));
    }
}

