package com.gla.methods;

import java.util.*;

public class Ques13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] marks=new int[n][3];
        Random r=new Random();
        for(int i=0;i<n;i++)
            for(int j=0;j<3;j++) marks[i][j]=10+r.nextInt(90);
        int[][] res=new int[n][3];
        for(int i=0;i<n;i++){
            int sum=marks[i][0]+marks[i][1]+marks[i][2];
            double per=Math.round((sum/3.0)*100.0)/100.0;
            res[i][0]=sum; res[i][1]=(int)per; res[i][2]=0;
            System.out.println(Arrays.toString(marks[i])+" Total:"+sum+" %:"+per);
        }
        sc.close();
    }
}