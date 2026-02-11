package com.rony.dsa.arrays.sorting;

import java.util.Arrays;

public class SelectionMax {
    public static void main(String[] args) {
        int[] arr = {4,1,7,6,2,8,5};

        for (int i = arr.length-1; i > 0; i--) {
            int max = i;
            for (int j = 0; j < i; j++) {
                if(arr[max] < arr[j]){
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
