package com.rony.dsa.arrays.prefixsum;

// Sliding Window + Prefix
public class SubarraySumK_Positive {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 9;

        int i = 0, sum = 0;

        for(int j = 0; j < arr.length; j++) {
            sum += arr[j];

            while(sum > k) {
                sum -= arr[i];
                i++;
            }

            if(sum == k) {
                System.out.println("Found at: " + i + " to " + j);
                break;
            }
        }
    }
}
