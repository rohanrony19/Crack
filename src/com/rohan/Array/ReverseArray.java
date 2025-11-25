package com.rohan.Array;

import java.util.Arrays;

// Time Complexity = O(n)
// Space Complexity = O(1)
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int start = 0,end = arr.length-1;
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed Array : ");
//        System.out.println(Arrays.toString(arr));
        for (int n : arr) System.out.print(n+" ");
    }
}
