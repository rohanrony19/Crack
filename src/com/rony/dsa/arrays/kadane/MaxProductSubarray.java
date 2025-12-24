package com.rony.dsa.arrays.kadane;

public class MaxProductSubarray {
    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};

        int currMax = arr[0];
        int currMin = arr[0];
        int ans = arr[0];

        for(int i = 1; i < arr.length; i++) {
            int temp = currMax;

            currMax = Math.max(arr[i], Math.max(currMax * arr[i], currMin * arr[i]));
            currMin = Math.min(arr[i], Math.min(temp * arr[i], currMin * arr[i]));

            ans = Math.max(ans, currMax);
        }

        System.out.println(ans);
    }
}
