package com.rony.dsa.arrays.kadane;

public class MaxSumIncreasingSubarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,5,7,1};

        int max = arr[0], curr = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1]) curr += arr[i];
            else curr = arr[i];

            max = Math.max(max, curr);
        }

        System.out.println(max);
    }
}
