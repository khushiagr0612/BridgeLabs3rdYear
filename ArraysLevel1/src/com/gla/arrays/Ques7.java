package com.gla.arrays;
import java.util.*;
public class Ques7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] even=new int[num/2];
		int[] odd=new int[(num/2)+1];
		if(num<=0) {
			System.out.println("Invalid Input");			
		}else {
			int evenIndex=0;
			int oddIndex=0;
			int i=1;
			while(i<=num) {
				if(i%2==0) {
					even[evenIndex]=i;
					evenIndex++;
				}else {
					odd[oddIndex]=i;
					oddIndex++;
				}
				i++;
			}
			System.out.print("Even Numbers: ");
			for(int k=0;k<evenIndex;k++) {
				System.out.print(even[k]+" ");
			}
			System.out.println();
			System.out.print("Odd Numbers: ");
			for(int k=0;k<oddIndex;k++) {
				System.out.print(odd[k]+" ");
			}
		
		}
		sc.close();
		
	}

}
