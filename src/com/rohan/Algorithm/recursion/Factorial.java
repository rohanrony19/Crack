package com.rohan.Algorithm.recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = fact(5);
        System.out.println(n);
    }
    static int fact(int n){
        if(n <= 1){
            return 1;
        }
        return n * fact(n-1);
    }
}
