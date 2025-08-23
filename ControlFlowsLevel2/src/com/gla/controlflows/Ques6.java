package com.gla.controlflows;
import java.util.Scanner;
public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age=new int[3];
        int[] height=new int[3];
        System.out.println("Enter age of Amar, Akbar and Anthony respectively");
        int minAge=Integer.MAX_VALUE;
        int indexAge=0;
        for(int i=0;i<3;i++){
            age[i]=sc.nextInt();
            if(age[i]<minAge){
                minAge=age[i];
                indexAge=i;
            }
        }
        System.out.println("Enter height of Amar, Akbar and Anthony respectively");
        int maxHeight=Integer.MIN_VALUE;
        int indexHeight=0;
        for(int i=0;i<3;i++){
            height[i]=sc.nextInt();
            if(height[i]>maxHeight){
                maxHeight=height[i];
                indexHeight=i;
            }
        }
        String[] names=new String[3];
        names[0]="Amar";
        names[1]="Akbar";
        names[2]="Anatony";
        System.out.println("The youngest of all is "+ names[indexAge]);
        System.out.println("The tallest of all is "+ names[indexHeight]);

    }
}
