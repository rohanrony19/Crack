package com.rony.dsa.arrays.kadane;

// Kadane = Best algorithm for maximum subarray sum in O(n).
public class Kadane {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int maxEnding = arr[0];
        int maxSoFar = arr[0];

        for(int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(arr[i], maxEnding + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEnding);
        }

        System.out.println(maxSoFar);
    }
}
