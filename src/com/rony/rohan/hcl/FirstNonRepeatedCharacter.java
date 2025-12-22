package com.rony.rohan.hcl;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String name = "swiss";
        int[] freq = new int[256];
        for (int i = 0; i < name.length(); i++) {
            freq[name.charAt(i)]++;
        }
        for (int i = 0; i < name.length(); i++) {
            if (freq[name.charAt(i)] == 1){
                System.out.println("First Non-repeated character : "+name.charAt(i));
                return;
            }
        }
        System.out.println("no unique character found");
    }
}
