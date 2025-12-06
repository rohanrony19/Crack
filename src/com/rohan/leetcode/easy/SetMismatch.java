package com.rohan.leetcode.easy;

import java.util.Arrays;

/*
645
Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]
    2 is duplicate and 3 is missing
Example 2:
Input: nums = [1,1]
Output: [1,2]
 */

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    public static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1){
                return new int[]{arr[index], index + 1 };
            }
        }
        return new int[]{-1,-1};
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

