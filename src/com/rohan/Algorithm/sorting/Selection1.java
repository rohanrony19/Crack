package com.rohan.Algorithm.sorting;

import java.util.Arrays;

// selecting smallest element
public class Selection1 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,-46,98,-69};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = getMaxIndex(arr,i,arr.length-1);
            swap(arr,maxIndex,i);
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int min = start;
        for (int i = start; i <= end ; i++) {
            if(arr[min] > arr[i]){
                min = i;
            }
        }
        return min;
    }
}
