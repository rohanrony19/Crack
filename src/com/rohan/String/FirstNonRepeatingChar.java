package com.rohan.String;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "swiss";
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                System.out.println("First non-repeating: " + str.charAt(i));
                return;
            }
        }
        System.out.println("No unique character found");
    }
}
