package com.practice.strings.basic;

public class CountVowels {
    public static void main(String[] args) {
        String s = "Hello World";
        int vowels = 0;


        s = s.toLowerCase();

        for (char ch:s.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }
        }
        System.out.println("Vowels: " + vowels);
    }
}
