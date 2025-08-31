package com.gla.methods;

import java.util.*;

public class Ques7 {
    static int[] factors(int n) {
        int c = 0; for (int i = 1; i <= n; i++) if (n % i == 0) c++;
        int[] f = new int[c]; int k = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) f[k++] = i;
        return f;
    }
    static int greatest(int[] a) {
        int m = a[0]; for (int x : a) if (x > m) m = x; return m;
    }
    static int sum(int[] a) { int s = 0; for (int x : a) s += x; return s; }
    static int product(int[] a) { int p = 1; for (int x : a) p *= x; return p; }
    static int cubeSum(int[] a) { int s = 0; for (int x : a) s += x*x*x; return s; }
    public static void main(String[] args) {
        int[] f = factors(12);
        System.out.println(Arrays.toString(f));
        System.out.println(greatest(f));
        System.out.println(sum(f));
        System.out.println(product(f));
        System.out.println(cubeSum(f));
    }
}