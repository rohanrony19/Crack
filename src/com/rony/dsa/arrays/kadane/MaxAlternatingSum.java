package com.rony.dsa.arrays.kadane;

public class MaxAlternatingSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        long inc = 0, dec = 0;

        for(int x : arr) {
            long newInc = Math.max(inc, dec + x);
            long newDec = Math.max(dec, inc - x);
            inc = newInc;
            dec = newDec;
        }

        System.out.println(inc);
    }
}
