package com.rohan.String;
// Time Complexity = O(n)
// Space Complexity = O(n)
public class ReverseAWord {
    public static void main(String[] args) {
        String name = "Java is Programming Language";
        StringBuilder reversedSentence = new StringBuilder();
        String[] words = name.split(" ");
        for (String word:words){
            StringBuilder reversedWord = new StringBuilder();
            for (int i = word.length()-1; i >= 0 ; i--) {
                reversedWord.append(word.charAt(i));
            }
            reversedSentence.append(reversedWord.append(" "));
        }
        System.out.println("Reversed words in sentence: " + reversedSentence.toString().trim());

    }
}
