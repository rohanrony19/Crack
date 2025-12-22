package com.rony.rohan.String;

public class DivideTwoInteger {
    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        return dividend/divisor;
    }

    public static void main(String[] args) {
        int dividend = 7;
        int divisor = -3;
        int result = divide(dividend,divisor);
        System.out.println(result);
    }
}
