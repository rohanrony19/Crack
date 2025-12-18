package com.practice.math;

public class HighestFactor {
    public static void main(String[] args) {
        int n = 36;
        int max = 1;

        for (int i = 1; i <= n/2; i++) {
            if(n % i == 0) max = i;
        }
        System.out.println(max);
    }
}
