package com.rony.dsa.arrays.sorting;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr ={0,2,1,2,0};
        int low = 0,mid = 0,high = arr.length-1;

        while (mid<=high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
