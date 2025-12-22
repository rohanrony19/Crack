package com.rony.dsa.math;

public class Factors {
    public static void main(String[] args) {
        int n = 28;

        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
