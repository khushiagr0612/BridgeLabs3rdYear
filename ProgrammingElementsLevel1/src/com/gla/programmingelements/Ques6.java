package com.gla.programmingelements;

public class Ques6 {
	public static void main(String[] args) {
		double fee=25000;
		double discount=10;
		double discountAmount=(fee*discount)/100;
		double discountedPrice=fee-discountAmount;
		System.out.println(" The discount amount is INR " +discountAmount+" and final discounted fee is INR "+discountedPrice);
	}

}