package com.rony.dsa.arrays.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeStriver {
    public static void main(String[] args) {
        int[] arr = {8,6,4,1,3,7,2,5};
        int n = arr.length-1;
        divide(arr,0,n);
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void divide(int[] arr, int low, int high) {
        if(low >= high){
            return;
        }

        int mid = (low + high) / 2;
        divide(arr,low,mid);
        divide(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>(); //new array to store sorted sub array
//        int[] temp = new int[high-low+1];

        int left = low; // pointer 1
        int right = mid + 1; // pointer 2
//        int k = 0;

        while (left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid){
            temp.add(arr[left]);
            left++;
        }

        while (right <= high){
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i-low);
        }
    }
}
