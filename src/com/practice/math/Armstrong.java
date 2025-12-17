package com.practice.math;

public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
        int temp = n;
        int sum = 0;

        while (temp > 0){
            int d = temp%10;
            sum += d * d * d;
            temp /= 10;
        }
        System.out.println(sum == n ? "Armstrong" : "Not Armstrong");
    }
}
