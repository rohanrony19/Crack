package com.rony.dsa.math;

public class SumFibonacci {
    public static void main(String[] args) {
        int n = 7;
        int a = 0,b = 1;
        int sum = a + b;

        for (int i = 2; i < n; i++) {
            int c = a + b;
            sum += c;
            a = b;
            b = c;
        }
        System.out.println("Sum: " + sum);
    }
}
