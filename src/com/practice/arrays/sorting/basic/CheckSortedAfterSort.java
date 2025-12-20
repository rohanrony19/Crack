package com.practice.arrays.sorting.basic;

import java.util.Arrays;

public class CheckSortedAfterSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        Arrays.sort(arr);

        boolean sorted = true;

        for (int i=1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                sorted = false;
            }
        }
        System.out.println(sorted ? "Sorted" : "Not Sorted");
    }
}
