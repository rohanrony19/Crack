package com.rohan.String;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class LargestWord {
    public static void main(String[] args) {
        String sentence = "Java is powerful programming language";
        int maxLen = 0;
        int startOfLargest = 0;

        int start = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (i == sentence.length() || sentence.charAt(i) == ' '){
                int wordLen = i-start;
                if (wordLen > maxLen){
                    maxLen = wordLen;
                    startOfLargest = start;
                }
                start = i+1;
            }
        }
        String largest = sentence.substring(startOfLargest, startOfLargest + maxLen);
        System.out.println("Largest word " + largest );
    }
}
