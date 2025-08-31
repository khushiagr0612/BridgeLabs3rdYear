package com.gla.methods;

public class Ques10 {
    static boolean collinearSlope(int x1,int y1,int x2,int y2,int x3,int y3){
        return (y2-y1)*(x3-x2)==(y3-y2)*(x2-x1);
    }
    static boolean collinearArea(int x1,int y1,int x2,int y2,int x3,int y3){
        int area=x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2);
        return area==0;
    }
    public static void main(String[] args){
        System.out.println(collinearSlope(2,4,4,6,6,8));
        System.out.println(collinearArea(2,4,4,6,6,8));
    }
}
