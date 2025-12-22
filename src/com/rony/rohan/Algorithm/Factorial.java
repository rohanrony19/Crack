package com.rony.rohan.Algorithm;
// 5! = 5*4*3*2*1

// Time Complexity = O(n)
// Space Complexity = O(1)

public class Factorial {
    static int Fact(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of "+ n + " is " + Fact(n));
    }
}

