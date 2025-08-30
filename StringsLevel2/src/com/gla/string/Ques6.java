package com.gla.string;

import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] result = analyzeCharacters(input);

        displayTable(result);
        sc.close();
    }

    static String checkCharType(char c) {
        if (c >= 'A' && c <= 'Z') {
            c = (char)(c + 32); // convert uppercase to lowercase
        }
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
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

    static String[][] analyzeCharacters(String s) {
        int len = getLength(s);
        String[][] result = new String[len][2];
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            result[i][0] = String.valueOf(c);
            result[i][1] = checkCharType(c);
        }
        return result;
    }

    static void displayTable(String[][] data) {
        System.out.println("\nCharacter\tType");
        System.out.println("-------------------------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}
