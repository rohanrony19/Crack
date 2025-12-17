package com.practice.math;

public class ArrayGCD {
    public static int gcd(int a,int b){
        return (b == 0 ? a : gcd(b,a % b));
    }
    public static void main(String[] args) {
        int[] arr = {24,60,36};
        int res = arr[0];

        for (int i = 1; i < arr.length; i++) {
            res = gcd(res,arr[i]);
        }
        System.out.println("GCD: " + res);
    }
}
