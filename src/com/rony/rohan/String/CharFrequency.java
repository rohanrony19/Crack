package com.rony.rohan.String;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class CharFrequency {
    public static void main(String[] args) {
        String name = "programming";
        int[] freq = new int[256];
        for (int i = 0; i < name.length(); i++) {
            freq[name.charAt(i)]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0 ){
                System.out.println((char) i + " -> " +freq[i]);
            }
        }
    }
}
