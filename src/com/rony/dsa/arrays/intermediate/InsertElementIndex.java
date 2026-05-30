package com.rony.dsa.arrays.intermediate;

import java.util.Arrays;

public class InsertElementIndex {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int index = 2;
        int value = 99;

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = value;

        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
