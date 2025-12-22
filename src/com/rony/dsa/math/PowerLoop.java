package com.rony.dsa.math;

public class PowerLoop {
    public static void main(String[] args) {
        int x = 2, n = 5;
        int res = 1;

        for (int i = 1; i <= n; i++) {
            res *= x;
        }
        System.out.println(res);
    }
}
