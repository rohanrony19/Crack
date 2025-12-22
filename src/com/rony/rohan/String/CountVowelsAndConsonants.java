package com.rony.rohan.String;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String name = "Java Programming";
//        String lowerCase = name.toLowerCase();  // O(n)
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            ch = Character.toLowerCase(ch);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
        System.out.println("Number of vowels in " + name + " is " + vowels);
        System.out.println("Number of consonants in " + name + " is " +consonants);
    }
}
