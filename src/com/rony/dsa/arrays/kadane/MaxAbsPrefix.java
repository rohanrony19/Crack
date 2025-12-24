package com.rony.dsa.arrays.kadane;

public class MaxAbsPrefix {
    public static void main(String[] args) {
        int[] arr = {2, -1, 4, -3, 5};

        int prefix = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for(int x : arr) {
            prefix += x;
            max = Math.max(max, prefix);
            min = Math.min(min, prefix);
        }

        System.out.println(Math.abs(max - min));
    }
}
