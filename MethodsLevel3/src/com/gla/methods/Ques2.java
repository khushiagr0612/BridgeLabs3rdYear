package com.gla.methods;

import java.util.*;

public class Ques2 {
    static int countDigits(int n) { return String.valueOf(n).length(); }
    static int[] storeDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }
    static boolean isDuck(int n) { return String.valueOf(n).contains("0"); }
    static boolean isArmstrong(int n) {
        int[] d = storeDigits(n); int p = d.length, sum = 0;
        for (int x : d) sum += Math.pow(x, p);
        return sum == n;
    }
    static int largest(int[] a) { int m = Integer.MIN_VALUE; for (int x : a) if (x > m) m = x; return m; }
    static int secondLargest(int[] a) { int f = Integer.MIN_VALUE, s = Integer.MIN_VALUE; for (int x : a) { if (x > f) { s = f; f = x; } else if (x > s && x != f) s = x; } return s; }
    static int smallest(int[] a) { int m = Integer.MAX_VALUE; for (int x : a) if (x < m) m = x; return m; }
    static int secondSmallest(int[] a) { int f = Integer.MAX_VALUE, s = Integer.MAX_VALUE; for (int x : a) { if (x < f) { s = f; f = x; } else if (x < s && x != f) s = x; } return s; }

    public static void main(String[] args) {
        System.out.println(countDigits(12345));
        int[] d = storeDigits(12345);
        System.out.println(Arrays.toString(d));
        System.out.println(isDuck(1023));
        System.out.println(isArmstrong(153));
        System.out.println(largest(d));
        System.out.println(secondLargest(d));
        System.out.println(smallest(d));
        System.out.println(secondSmallest(d));
    }
}
