package com.rony.dsa.arrays.intermediate;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int target = 30;

        int[] result = new int[arr.length-1];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != target){
                result[k++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
