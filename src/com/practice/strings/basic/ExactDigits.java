package com.practice.strings.basic;

public class ExactDigits {
    public static void main(String[] args) {
        String s = "a1b2c3";
        String digits = "";

        for (char c:s.toCharArray()){
            if(Character.isDigit(c)){
                digits += c;
            }
        }
        System.out.println(digits);
    }
}
