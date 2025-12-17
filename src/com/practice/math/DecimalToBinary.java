package com.practice.math;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 10;
        String bin = "";

        while (n > 0){
            bin = (n % 2) + bin;
            n /= 2;
        }
        System.out.println(bin);
    }
}
