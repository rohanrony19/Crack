package com.rony.dsa.arrays.basic;

import java.util.Arrays;

public class ReplaceNegative {
    public static void main(String[] args) {
        int[] arr = {10, -5, 20, -7, 30};

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
