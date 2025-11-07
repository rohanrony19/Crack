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

//        leetcode
//        int Len = 0;
//        int i = s.length()-1;
//
//        while(i>=0 && s.charAt(i) == ' '){
//            i--;
//        }
//        while(i>=0 && s.charAt(i) != ' '){
//            Len++;
//            i--;
//        }
//        return Len;
    }
}
