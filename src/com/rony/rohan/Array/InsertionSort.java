package com.rony.rohan.Array;

import java.util.Arrays;

//Useful for small/partially sorted arrays.
//🔥 Time Complexity:
//Best: O(n)
//Worst: O(n²)
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
