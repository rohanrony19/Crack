package com.rohan.Array;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class SumAndAverage {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        
        double avg = (double) sum/arr.length;
        System.out.println(sum);
        System.out.println(avg);
    }
}
