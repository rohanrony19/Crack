package com.rony.dsa.arrays.sorting;

import java.util.Arrays;

//Missing number
//Find duplicate
//Find all missing numbers
//Find corrupt pair
//First missing positive

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,3,1,4,2};

        int i =0;

        
        while(i<arr.length){
            int index = arr[i] - 1;
            if(arr[i] != arr[index]){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
