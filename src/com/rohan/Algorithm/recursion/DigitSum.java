package com.rohan.Algorithm.recursion;

// t = O(log(n))
// 1+3+4+2 = 10
public class DigitSum {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(sum(n));
    }

    static int sum(int n){
        if(n == 0){
            return 0;
        }

        return (n % 10) + sum(n/10);
    }
}
