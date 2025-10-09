package com.rohan.Array;
//Kadane’s Algorithm (Maximum Subarray Sum)
//Example: [-2, 1, -3, 4, -1, 2, 1, -5, 4] → 6 (4 + -1 + 2 + 1)
// Time Complexity = O(n)
// Space Complexity = O(1)
public class Kadane {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSoFar = arr[0];
        int curr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            curr = Math.max(arr[i],curr + arr[i]);
            maxSoFar = Math.max(maxSoFar,curr);
        }
        System.out.println("Max Subarray Sum = " + maxSoFar);
    }
}
