package com.gla.string;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = sc.nextLine();

        String[] words = splitIntoWords(input);
        String[][] wordLengthTable = buildWordLengthTable(words);
        int[] result = findShortestAndLongest(wordLengthTable);

        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (String[] row : wordLengthTable) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }

        System.out.println("\nShortest Word: " + wordLengthTable[result[0]][0] +
                           " (Length: " + wordLengthTable[result[0]][1] + ")");
        System.out.println("Longest Word: " + wordLengthTable[result[1]][0] +
                           " (Length: " + wordLengthTable[result[1]][1] + ")");
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

    static String[][] buildWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(getLength(words[i]));
        }
        return table;
    }

    static int[] findShortestAndLongest(String[][] wordLengthTable) {
        int minIndex = 0;
        int maxIndex = 0;
        int minLength = Integer.parseInt(wordLengthTable[0][1]);
        int maxLength = minLength;

        for (int i = 1; i < wordLengthTable.length; i++) {
            int length = Integer.parseInt(wordLengthTable[i][1]);
            if (length < minLength) {
                minLength = length;
                minIndex = i;
            }
            if (length > maxLength) {
                maxLength = length;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }
}
