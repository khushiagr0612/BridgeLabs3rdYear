package com.gla.controlflows;
import java.util.Scanner;
public class Ques12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power=sc.nextInt();
        int ans=1;
        for(int i=1;i<=power;i++){
            ans=ans*num;
        }
        System.out.println(ans);
    }
}
