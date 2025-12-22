package com.rony.dsa.arrays.twopointers;

import java.util.Arrays;

public class Sort012_TP {
    public static void main(String[] args) {
        int[] arr = {0,1,2,1,0};
        int low = 0,mid = 0,high = arr.length - 1;

        while (mid<high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
