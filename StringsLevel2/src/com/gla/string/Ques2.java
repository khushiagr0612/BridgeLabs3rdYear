package com.gla.string;

import java.util.Scanner;

public class Ques2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = sc.nextLine();

        String[] customSplit = splitIntoWords(input);
        String[] builtInSplit = input.split("\\s+");

        System.out.println("Custom Split:");
        for (String w : customSplit) System.out.println(w);

        System.out.println("Built-in Split:");
        for (String w : builtInSplit) System.out.println(w);

        boolean same = compareArrays(customSplit, builtInSplit);
        System.out.println("Both results are equal: " + same);
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

    static String[] splitIntoWords(String text) {
        int len = getLength(text);
        int wordCount = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }
        wordCount++;

        int[] spaces = new int[wordCount + 1];
        int idx = 0;
        spaces[idx++] = -1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaces[idx++] = i;
            }
        }
        spaces[idx] = len;

        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            int start = spaces[i] + 1;
            int end = spaces[i + 1];
            StringBuilder sb = new StringBuilder();
            for (int j = start; j < end; j++) {
                sb.append(text.charAt(j));
            }
            words[i] = sb.toString();
        }
        return words;
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }
}
