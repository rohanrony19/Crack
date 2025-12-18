package com.practice.math;
/*
    “The biggest number that divides both numbers exactly (without remainder).”
    48 is divisible by 1,2,3,4,6,8,12,16,24,48
    18 is divisible by 1,2,3,6,9,18
    => both have highest divisor 6
 */
public class GCD {
    public static int gcd(int a,int b){
        if(b == 0) return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        System.out.println(gcd(48,18));
    }
}
