package com.practice.math;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        boolean isPower = (n > 0) && ((n & (n - 1)) == 0);

        System.out.println(isPower);
    }
}
