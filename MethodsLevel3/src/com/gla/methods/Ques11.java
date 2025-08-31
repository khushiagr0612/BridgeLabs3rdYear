package com.gla.methods;

import java.util.*;

public class Ques11 {
    public static void main(String[] args){
        Random r=new Random();
        int[][] arr=new int[10][2];
        for(int i=0;i<10;i++){ arr[i][0]=10000+r.nextInt(90000); arr[i][1]=1+r.nextInt(10); }
        int[][] res=new int[10][3]; int total=0;
        for(int i=0;i<10;i++){
            int sal=arr[i][0]; int yrs=arr[i][1];
            int bonus=(yrs>5)? sal*5/100 : sal*2/100;
            res[i][0]=sal; res[i][1]=bonus; res[i][2]=sal+bonus;
            total+=bonus;
        }
        for(int i=0;i<10;i++) System.out.println(arr[i][0]+" "+arr[i][1]+" "+res[i][0]+" "+res[i][1]+" "+res[i][2]);
        System.out.println("Total Bonus:"+total);
    }
}