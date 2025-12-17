package com.practice.math;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String bin = "1010";
        int dec = 0;

        for (int i = 0; i < bin.length(); i++) {
            dec = dec * 2 + (bin.charAt(i) - '0');
        }
        System.out.println(dec);
    }
}
