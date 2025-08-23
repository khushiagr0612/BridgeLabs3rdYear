package com.gla.controlflows;
import java.util.Scanner;
public class Ques14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power = sc.nextInt();
        int ans = 1;
        int i=1;
        while(i<=power){
            ans=ans*num;
            i++;
        }
        System.out.println(ans);
    }
}
