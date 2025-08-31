package com.gla.methods;

public class Ques12 {
    static double distance(int x1,int y1,int x2,int y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    static double[] lineEq(int x1,int y1,int x2,int y2){
        double m=(double)(y2-y1)/(x2-x1);
        double b=y1-m*x1;
        return new double[]{m,b};
    }
    public static void main(String[] args){
        System.out.println(distance(0,0,3,4));
        double[] eq=lineEq(1,2,3,4);
        System.out.println("y="+eq[0]+"x+"+eq[1]);
    }
}