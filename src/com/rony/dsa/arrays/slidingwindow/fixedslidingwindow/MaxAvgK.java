package com.rony.dsa.arrays.slidingwindow.fixedslidingwindow;

public class MaxAvgK {
    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
        int k = 4;

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int max = sum;

        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i-k];
            max = Math.max(max,sum);
        }
        System.out.println((double) max/k);
    }
}
