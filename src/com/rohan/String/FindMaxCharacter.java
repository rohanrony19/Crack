package com.rohan.String;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class FindMaxCharacter {
    public static void main(String[] args) {
        String str = "samplzzzzz string";
        int[] freq = new int[256]; // ASCII range
        int maxCount = 0;
        char maxChar = ' ';

        for (char c : str.toCharArray()) {
            freq[c]++;
            if (freq[c] > maxCount) {
                maxCount = freq[c];
                maxChar = c;
            }
        }

        System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("Occurrence count: " + maxCount);
    }
}
