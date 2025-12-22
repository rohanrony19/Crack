package com.rony.dsa.math;

public class StrongNumber {
    public static int fact(int n){
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args) {
        int n = 145, temp = n, sum = 0;

        while (temp > 0){
            sum += fact(temp%10);
            temp /= 10;
        }
        System.out.println(sum == n ? "Strong" : "Not Strong");
    }
}
