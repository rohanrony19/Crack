package com.rohan.Array;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        int n = 6;
        int sum = n * (n+1)/2;
        int actualSum = 0;
        for (int num:arr) actualSum = actualSum + num;
        System.out.println("Missing Number: " + (sum-actualSum));
        
    }
}
