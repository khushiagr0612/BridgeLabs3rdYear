package com.gla.methods;

public class Ques3 {
    static int countDigits(int n) { return String.valueOf(n).length(); }
    static int[] storeDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }
    static int sumDigits(int[] a) { int s = 0; for (int x : a) s += x; return s; }
    static int sumSquares(int[] a) { int s = 0; for (int x : a) s += Math.pow(x, 2); return s; }
    static boolean isHarshad(int n) {
        int[] d = storeDigits(n);
        return n % sumDigits(d) == 0;
    }
    static int[][] digitFrequency(int n) {
        String s = String.valueOf(n);
        int[] freq = new int[10];
        for (char c : s.toCharArray()) freq[c - '0']++;
        int[][] res = new int[10][2];
        for (int i = 0; i < 10; i++) { res[i][0] = i; res[i][1] = freq[i]; }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(countDigits(1234));
        int[] d = storeDigits(1234);
        System.out.println(sumDigits(d));
        System.out.println(sumSquares(d));
        System.out.println(isHarshad(21));
        int[][] f = digitFrequency(221123);
        for (int[] x : f) System.out.println(x[0] + " " + x[1]);
    }
}