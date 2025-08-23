package com.gla.controlflows;
import java.util.Scanner;
public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        if(num>0){
            int i=1;
            while(i<=num){
                if(num%i==0){
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}
