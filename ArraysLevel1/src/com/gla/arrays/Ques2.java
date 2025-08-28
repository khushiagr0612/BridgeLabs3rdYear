package com.gla.arrays;
import java.util.*;
public class Ques2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] num=new int[5];
		for(int i=0;i<5;i++) {
			num[i]=sc.nextInt();
			if(num[i]<0) {
				System.out.println(num[i]+ " is negative number");
			}else if(num[i]==0) {
				System.out.println(num[i] +" is zero");
			}else {
				System.out.println(num[i]+" is negative");
			}
			if(num[i]%2==0) {
				System.out.println(num[i]+" is even number");
			}else {
				System.out.println(num[i]+" is odd number");
			}
		}
		if(num[0]==num[4]) {
			System.out.println("First and last numbers are equal");
		}else if(num[0]>num[4]) {
			System.out.println(num[0]+" is greater than "+num[4]);
		}else {
			System.out.println(num[0]+" is less than "+num[4]);
		}
		sc.close();
		
	}

}
