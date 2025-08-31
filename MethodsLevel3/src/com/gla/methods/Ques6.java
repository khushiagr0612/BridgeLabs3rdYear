package com.gla.methods;
public class Ques6 {
    static boolean isPerfect(int n) {
        int sum = 0; for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum == n;
    }
    static boolean isAbundant(int n) {
        int sum = 0; for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum > n;
    }
    static boolean isDeficient(int n) {
        int sum = 0; for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum < n;
    }
    static boolean isStrong(int n) {
        int sum = 0, t = n;
        while (t > 0) {
            int d = t % 10, f = 1;
            for (int i = 1; i <= d; i++) f *= i;
            sum += f; t /= 10;
        }
        return sum == n;
    }
    public static void main(String[] args) {
        System.out.println(isPerfect(28));
        System.out.println(isAbundant(12));
        System.out.println(isDeficient(15));
        System.out.println(isStrong(145));
    }
}