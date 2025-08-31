package com.gla.methods;

public class Ques9 {
    static String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
    static boolean leap(int y) { return (y%4==0 && y%100!=0) || y%400==0; }
    static int firstDay(int y,int m) {
        int d=1; y=y-(14-m)/12;
        int x=y+y/4-y/100+y/400;
        m=m+12*((14-m)/12)-2;
        return (d+x+31*m/12)%7;
    }
    public static void main(String[] args) {
        int y=2005,m=7;
        if (leap(y)) days[1]=29;
        System.out.println(months[m-1]+" "+y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int fd=firstDay(y,m);
        for(int i=0;i<fd;i++) System.out.print("    ");
        for(int d=1;d<=days[m-1];d++){
            System.out.printf("%3d ",d);
            if((d+fd)%7==0) System.out.println();
        }
    }
}
