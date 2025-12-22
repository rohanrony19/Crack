package com.rony.dsa.arrays.slidingwindow.variableslidingwindow;

public class MinSizeSubarray {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int k = 7;

        int i = 0, sum = 0, minLen = Integer.MAX_VALUE;

        for(int j = 0; j < arr.length; j++) {
            sum += arr[j];

            while(sum >= k) {
                minLen = Math.min(minLen, j - i + 1);
                sum -= arr[i];
                i++;
            }
        }

        System.out.println(minLen == Integer.MAX_VALUE ? 0 : minLen);
    }
}
