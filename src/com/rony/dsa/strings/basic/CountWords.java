package com.rony.dsa.strings.basic;

public class CountWords {
    public static void main(String[] args) {
        String s = "Java is awesome";
        String[] words = s.trim().split("\\s+");

        System.out.println("Words: " + words.length);
    }
}
