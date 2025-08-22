package com.gla.programmingelements;
import java.util.Scanner;
public class Ques16 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfStudents=sc.nextInt();
        int handshake=(numberOfStudents*(numberOfStudents-1))/2;
        System.out.println("Number of possible handshakes is "+handshake);
    }

}