package com.rony.dsa.math;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 12345;
        int res = 0;
        while (n>0){
            int temp = n % 10;
            res = res * 10 + temp;
            n /= 10;
        }
        System.out.println("Reverse: " + res);
    }
}
