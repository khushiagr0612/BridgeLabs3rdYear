package com.gla.methods;

import java.util.*;

public class Ques4 {
    static int countDigits(int n) { return String.valueOf(n).length(); }
    static int[] storeDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }
    static int[] reverse(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) b[i] = a[a.length-1-i];
        return b;
    }
    static boolean equal(int[] a, int[] b) { return Arrays.equals(a, b); }
    static boolean isPalindrome(int n) {
        String s = String.valueOf(n);
        return s.equals(new StringBuilder(s).reverse().toString());
    }
    static boolean isDuck(int n) { return String.valueOf(n).contains("0"); }
    public static void main(String[] args) {
        int n = 1221;
        int[] d = storeDigits(n);
        System.out.println(Arrays.toString(reverse(d)));
        System.out.println(equal(d, reverse(d)));
        System.out.println(isPalindrome(n));
        System.out.println(isDuck(1023));
    }
}