package com.gla.methods;

import java.util.*;

public class Ques15 {
    static int[][] randomMatrix(int r,int c){
        Random rand=new Random();
        int[][] m=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) m[i][j]=rand.nextInt(5)+1;
        return m;
    }
    static int[][] transpose(int[][] a){
        int r=a.length,c=a[0].length;
        int[][] t=new int[c][r];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) t[j][i]=a[i][j];
        return t;
    }
    static int det2(int[][] a){ return a[0][0]*a[1][1]-a[0][1]*a[1][0]; }
    static int det3(int[][] a){
        return a[0][0]*(a[1][1]*a[2][2]-a[1][2]*a[2][1])
             - a[0][1]*(a[1][0]*a[2][2]-a[1][2]*a[2][0])
             + a[0][2]*(a[1][0]*a[2][1]-a[1][1]*a[2][0]);
    }
    static double[][] inv2(int[][] a){
        int d=det2(a);
        double[][] inv={{a[1][1]/(double)d,-a[0][1]/(double)d},
                        {-a[1][0]/(double)d,a[0][0]/(double)d}};
        return inv;
    }
    static double[][] inv3(int[][] a){
        int d=det3(a);
        double[][] inv=new double[3][3];
        for(int i=0;i<3;i++) for(int j=0;j<3;j++){
            int[][] m=new int[2][2]; int r=0,c=0;
            for(int x=0;x<3;x++) if(x!=i){
                c=0;
                for(int y=0;y<3;y++) if(y!=j) m[r][c++]=a[x][y];
                r++;
            }
            int minor=det2(m);
            inv[j][i]=Math.pow(-1,i+j)*minor/(double)d;
        }
        return inv;
    }
    static void print(int[][] m){
        for(int[] r:m){ for(int x:r) System.out.print(x+" "); System.out.println(); }
        System.out.println();
    }
    static void print(double[][] m){
        for(double[] r:m){ for(double x:r) System.out.printf("%.2f ",x); System.out.println(); }
        System.out.println();
    }
    public static void main(String[] args){
        int[][] a=randomMatrix(3,3);
        print(a);
        print(transpose(a));
        System.out.println(det2(new int[][]{{1,2},{3,4}}));
        System.out.println(det3(a));
        print(inv2(new int[][]{{4,7},{2,6}}));
        print(inv3(a));
    }
}