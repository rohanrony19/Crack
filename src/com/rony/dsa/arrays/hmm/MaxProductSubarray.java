package com.rony.dsa.arrays.hmm;

public class MaxProductSubarray {
    public static void main(String[] args) {
        int[] arr = {-2, 6, -3, -10, 0, 2};

        int max = arr[0];
        int min = arr[0];
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];

            int tempMax = Math.max(curr, Math.max(curr * max, curr * min));
            int tempMin = Math.min(curr, Math.min(curr * max, curr * min));

            max = tempMax;
            min = tempMin;

            result = Math.max(result, max);
        }

        System.out.println(result);
    }
}