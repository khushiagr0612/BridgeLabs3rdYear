package com.gla.programmingelements;
import java.util.Scanner;
public class Ques8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double distance=sc.nextDouble();
		double miles=distance*1.6;
		System.out.println("The total miles is " + miles +" mile for the given "+distance+ " km");
		
	}

}