package com.rony.dsa.arrays.twopointers;

import java.util.Arrays;

public class MoveZeros_TP {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int insertPos = 0;

        for (int num:arr){
            if(num != 0){
                arr[insertPos++] = num;
            }
        }
        while (insertPos < arr.length) arr[insertPos++] = 0;

        System.out.println(Arrays.toString(arr));
    }
}
