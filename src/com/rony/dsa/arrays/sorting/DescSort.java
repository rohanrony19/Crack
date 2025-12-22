package com.rony.dsa.arrays.sorting;

import java.util.Arrays;
import java.util.Collections;

public class DescSort {
    public static void main(String[] args) {
        Integer[] arr = {10,40,20,5};

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
    }
}
