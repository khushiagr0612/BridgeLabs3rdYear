package com.gla.controlFlows;
import java.util.Scanner;
public class Ques17{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int yearsOfExperience=sc.nextInt();
        double salary=sc.nextDouble();
        double bonus=0;
        if(yearsOfExperience>=5){
            bonus=(salary*0.05);
        }
        System.out.println("Bonus will be Rs "+bonus);

    }
}