package com.gla.arrays;
import java.util.*;
public class Ques3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ans=new int[10];
		for(int i=0;i<10;i++) {
			ans[i]=n*(i+1);
			System.out.println(n+"*"+(i+1)+"="+ans[i]);
		}
		sc.close();
		
	}

}
