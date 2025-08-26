package com.gla.controlFlows;
import java.util.*;
public class Ques13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            int sum=0;
            for(int i=1;i<=n;i++){
                sum+=i;
            }
            int sumByFormula=(n*(n+1))/2;
            System.out.println("Sum of natural numbers till "+n+" is "+sum);
            if(sum==sumByFormula){
                System.out.println("Both, by formula and by for loop are having same values");
            }

        }
    }
}