package com.practice.arrays.basic;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int[] copy = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        System.out.println(Arrays.toString(copy));
    }
}
