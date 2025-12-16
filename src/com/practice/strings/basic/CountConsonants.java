package com.practice.strings.basic;

public class CountConsonants {
    public static void main(String[] args) {
        String s = "Hello World";
        int count = 0;
        s = s.toLowerCase();

        for (char ch:s.toCharArray()){
            if(Character.isLetter(ch) && !"aeiou".contains(ch + "")){
                count++;
            }
        }
        System.out.println("Consonants: " + count);
    }
}
