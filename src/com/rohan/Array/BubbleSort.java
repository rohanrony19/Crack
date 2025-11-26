package com.rohan.Array;

import java.util.Arrays;

// Time Complexity = O(n^2)
// Space Complexity = O(1)
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,3,8,1,4,2,9};
        for (int i = 0; i < arr.length-1; i++) {
            boolean swapped  = false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)break;
        }

        
        System.out.print("Sorted array: ");
        for (int n : arr) System.out.print(n + " ");
//        System.out.println(Arrays.toString(arr));
    }
}
