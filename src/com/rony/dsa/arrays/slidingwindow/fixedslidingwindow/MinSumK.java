package com.rony.dsa.arrays.slidingwindow.fixedslidingwindow;

public class MinSumK {
    public static void main(String[] args) {
        int[] arr = {4,2,1,7,8};
        int k = 2;

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int min = sum;

        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            min = Math.min(min,sum);
        }

        System.out.println("Min sum: " + min);
    }
}
