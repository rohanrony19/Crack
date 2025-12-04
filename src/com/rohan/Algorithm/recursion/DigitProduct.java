package com.rohan.Algorithm.recursion;

// 1*3*4*2 = 25
public class DigitProduct {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(sum(n));
    }

    static int sum(int n){
        if(n%10 == n){
            return n;
        }

        return (n % 10) * sum(n/10);
    }
}
