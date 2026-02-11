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
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
