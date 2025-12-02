package com.rohan.NumberSystem;
// Time Complexity = O(n)
// Space Complexity = O(n)
public class RecursiveFactorial {
    public static long fact(int n){
        if(n <= 1) return 1; // base condition
        return n * fact(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
}
