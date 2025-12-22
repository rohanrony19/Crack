package com.rony.dsa.math;

public class PrintPrimes {
    public static void main(String[] args) {
        int n = 50;

        for (int i = 2; i <= n; i++) {
            boolean prime = true;
            for (int j = 2; j * j <= i; j++) {
                if(i % j == 0){
                    prime = false;
                    break;
                }
            }
            if(prime) System.out.print(i + " ");
        }
    }
}
