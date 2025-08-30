package com.gla.string;

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();

        int[] trimPoints = findTrimPoints(input);
        String customTrimmed = customSubstring(input, trimPoints[0], trimPoints[1]);
        String builtInTrimmed = input.trim();

        System.out.println("Custom Trimmed String: [" + customTrimmed + "]");
        System.out.println("Built-in Trimmed String: [" + builtInTrimmed + "]");
        System.out.println("Are both equal? " + compareStrings(customTrimmed, builtInTrimmed));
        sc.close();
    }

    static int getLength(String s) {
        int count = 0;
        try {
            for (;; count++) {
                s.charAt(count);
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    static int[] findTrimPoints(String s) {
        int len = getLength(s);
        int start = 0;
        int end = len - 1;

        while (start < len && s.charAt(start) == ' ') {
            start++;
        }
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    static String customSubstring(String s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    static boolean compareStrings(String s1, String s2) {
        int len1 = getLength(s1);
        int len2 = getLength(s2);
        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
}
