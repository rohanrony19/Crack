package com.rony.dsa.arrays.intermediate;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 3, 12};
        int index = 0;

        for (int num:arr) {
            if(num != 0){
                arr[index++] = num;
            }
        }
        while (index<arr.length) arr[index++] = 0;
        System.out.println(Arrays.toString(arr));
    }
}
