package com.gla.controlflows;
import java.util.Scanner;
public class Ques13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int i=100;
        if(num>0 && num<100) {
            while (i >= 1) {
                if (i % num == 0) {
                    System.out.println(i);
                }
                i--;
            }
        }
    }
}
