package com.rony.dsa.math;

public class EvenDigits {
    public static void main(String[] args) {
        int n = 482796;
        int count = 0;

        while (n > 0) {
            if((n % 10) % 2 == 0){
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
