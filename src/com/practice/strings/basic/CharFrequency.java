package com.practice.strings.basic;

public class CharFrequency {
    public static void main(String[] args) {
        String s = "banana";
        int[] freq = new int[256];

        for (char c : s.toCharArray()) freq[c]++;

        for (int i = 0; i < freq.length; i++) {
            if(freq[i] > 0){
                System.out.println((char) i + " = " + freq[i]);
            }
        }
    }
}
