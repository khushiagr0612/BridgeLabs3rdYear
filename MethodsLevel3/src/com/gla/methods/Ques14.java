package com.gla.methods;

import java.util.*;

public class Ques14 {
    static int[][] randomMatrix(int r,int c){
        Random rand=new Random();
        int[][] m=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) m[i][j]=rand.nextInt(10);
        return m;
    }
    static int[][] add(int[][] a,int[][] b){
        int r=a.length,c=a[0].length;
        int[][] res=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) res[i][j]=a[i][j]+b[i][j];
        return res;
    }
    static int[][] sub(int[][] a,int[][] b){
        int r=a.length,c=a[0].length;
        int[][] res=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) res[i][j]=a[i][j]-b[i][j];
        return res;
    }
    static int[][] mul(int[][] a,int[][] b){
        int r=a.length,c=b[0].length,n=a[0].length;
        int[][] res=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) for(int k=0;k<n;k++) res[i][j]+=a[i][k]*b[k][j];
        return res;
    }
    static void print(int[][] m){
        for(int[] row:m){ for(int x:row) System.out.print(x+" "); System.out.println(); }
        System.out.println();
    }
    public static void main(String[] args){
        int[][] a=randomMatrix(2,2);
        int[][] b=randomMatrix(2,2);
        print(a); print(b);
        print(add(a,b));
        print(sub(a,b));
        print(mul(a,b));
    }
}