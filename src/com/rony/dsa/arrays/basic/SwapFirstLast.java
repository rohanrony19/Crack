package com.rony.dsa.arrays.basic;

import java.util.Arrays;

public class SwapFirstLast {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
