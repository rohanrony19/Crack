package com.rony.dsa.arrays.slidingwindow.variableslidingwindow;

public class MaxLenSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,1,0,1,1,0};
        int k = 4;

        int i = 0, sum = 0, maxLen = 0;

        for(int j = 0; j < arr.length; j++) {
            sum += arr[j];

            while(sum > k) {
                sum -= arr[i];
                i++;
            }

            maxLen = Math.max(maxLen, j - i + 1);
        }

        System.out.println(maxLen);
    }
}
