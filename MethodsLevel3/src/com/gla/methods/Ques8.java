package com.gla.methods;

import java.util.*;

public class Ques8 {
    static String generateOTP() {
        Random r = new Random();
        int num = 100000 + r.nextInt(900000);
        return String.valueOf(num);
    }
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        while (set.size() < 10) set.add(generateOTP());
        System.out.println(set);
    }
}
