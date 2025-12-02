package com.rohan.NumberSystem;
// Brute Force method
// Time Complexity = O(n)
// Space Complexity = O(1)
public class PrimeNumber {
    static boolean prime(int n){
        if(n<=1) return false;

        for (int i = 2; i < n; i++) {
            if(n % i == 0 ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 375113;
        System.out.println(num + (prime(num)? " is Prime":" is not a Prime"));
    }
}
