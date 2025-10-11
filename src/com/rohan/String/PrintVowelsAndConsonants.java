package com.rohan.String;
// Time Complexity = O(n)
// Space Complexity = O(n)
public class PrintVowelsAndConsonants {
    public static void main(String[] args) {
        String name = "Java Programming";
        String vowels = "";
        String consonants = "";

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            ch = Character.toLowerCase(ch);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels = vowels + ch;
            }else if (ch >= 'a' && ch <= 'z'){
                consonants += ch;
            }
        }

        System.out.println("Number of vowels in " + name + " is " + vowels);
        System.out.println("Number of consonants in " + name + " is " +consonants);
    }
}
