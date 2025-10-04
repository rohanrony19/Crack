package com.rohan.Algorithm;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int []arr={29,39,47,59,98,34,45,56,12,32};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
