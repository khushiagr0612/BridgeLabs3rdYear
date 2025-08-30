package com.gla.string;

public class Ques4 {

    @SuppressWarnings("null")
    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    @SuppressWarnings("null")
    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e);
        }
    }

    public static void main(String[] args) {
        // generateException();
        handleException();
    }
}