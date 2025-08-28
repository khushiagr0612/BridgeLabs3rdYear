package com.gla.arrays;
import java.util.*;
public class Ques5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] arr=new int[4];
		for(int i=0;i<4;i++) {
			arr[i]=num*(i+6);
			System.out.println(num+"*" +(i+6)+"="+arr[i]);
		}
		
		sc.close();
	}

}
