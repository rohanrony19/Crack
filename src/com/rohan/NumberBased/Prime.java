package com.rohan.NumberBased;
// Optimized method
// Time Complexity = O(sqrt(n)) less
// Space Complexity = O(1)
public class Prime {
    public static boolean optimized(int n){
        if(n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 375113573;
        System.out.println(num + (optimized(num)? " is Prime":" is not a Prime"));
    }
}
