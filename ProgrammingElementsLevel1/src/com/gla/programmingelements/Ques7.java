package com.gla.programmingelements;
public class Ques7 {

	public static void main(String[] args) {
		double radius=6378;
		double volInKM=((4/3)*3.14)*(Math.pow(radius,3));
		double volInMiles=volInKM*1.6;
		System.out.println("The volume of earth in cubic kilometers is "+ volInKM+" and cubic miles is "+volInMiles);
	
	}

}