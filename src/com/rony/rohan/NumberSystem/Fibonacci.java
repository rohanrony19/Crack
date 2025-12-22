package com.rony.rohan.NumberSystem;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class Fibonacci {
    public static void fibo(int n){
        int a = 0,b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        fibo(20);
    }
}
