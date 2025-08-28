package com.gla.arrays;
import java.util.*;
public class Ques4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0;
		int[] arr=new int[10];
		while(n<10) {
			int num=sc.nextInt();
			if(num<=0) {
				break;
			}else {
				arr[n]=num;
			}
			n++;
		}
		int sum=0;
		for(int i=0;i<10;i++) {
			System.out.println(arr[i]);
			sum+=arr[i];
		}
		System.out.println("Sum: "+sum);
		sc.close();
	}

}
