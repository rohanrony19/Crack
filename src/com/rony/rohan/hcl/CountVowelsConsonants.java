package com.rony.rohan.hcl;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        String name = "Java is wonderful";
        name = name.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        String vowel = "";
        String consonant = "";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
                vowel += ch;
            }else if(ch >= 'a' && ch <= 'z'){
                consonants++;
                consonant += ch;
            }
        }
        System.out.println(vowel + " : " + vowels);
        System.out.println(consonant + " : " +consonants);
    }
}
