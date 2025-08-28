package com.gla.arrays;
import java.util.*;
public class Ques1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] age=new int[10];
		for(int i=0;i<10;i++) {
			age[i]=sc.nextInt();
			if(age[i]<0) {
				System.out.println("Invalid Input");
			}else if(age[i]<18) {
				System.out.println("Student with age "+age[i]+" is not eligible to vote");
			}else {
				System.out.println("Student with age "+age[i]+" is eligible to vote");
			}
		}
		sc.close();
		
		
	}

}
