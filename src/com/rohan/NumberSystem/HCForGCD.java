package com.rohan.NumberSystem;
// Highest common Factor both a and b which are divisible by highest number
// The largest number that divides both numbers.  ->  GCD(12, 18) = 6
// Time Complexity = O(log(min(a,b)))
// Space Complexity = O(n)
public class HCForGCD {
    public static int gcd(int a,int b){
        while (b != 0){
            int temp = b;
            b = a % b;
          //b = 24 % 36 = 24<36 = 24
          //b = 36 % 24 = 12 remainder
          //b = 24 % 12 = 0 remainder
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 24,b = 36;
        System.out.println("GCD = " + gcd(a,b));
    }
}
