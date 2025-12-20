package com.practice.arrays.sorting.basic;

import java.util.Arrays;

public class AllInOne {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,4};
        int target = 2;
        int res = linear(arr,target);
        System.out.println(res);

        int[] arr1 = {1,2,3,4,5,8};
        int target1 = 4;
        System.out.println(binary(arr1,target1));

        int[] arr2 = {8,5,1,2,3,4};
        int[] res1 = bubble(arr2);
        System.out.println(Arrays.toString(res1));

        int[] arr3 = {8,5,1,2,3,4};
        int[] res2 = selection(arr3);
        System.out.println(Arrays.toString(res2));

        int[] arr5 = {8,5,1,2,3,4};
        int[] res4 = selection1(arr5);
        System.out.println(Arrays.toString(res4));

        int[] arr4 = {8,5,1,2,3,4};
        int[] res3 = insertion(arr4);
        System.out.println(Arrays.toString(res3));
    }

    public static int linear(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int binary(int[] arr,int target){
        int start = 0,end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] < target){
                start = mid + 1;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static int[] bubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j =  1; j < arr.length-i; j++) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)break;
        }
        return arr;
    }

    // descending
    public static int[] selection(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int max = i; // 0

            for (int j = i; j < arr.length; j++) { // j = 1
            if (arr[j] > arr[max]) { // arr[1] < arr[0]
                max = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[max];
        arr[max] = temp;
        }
        return arr;
    }

    // ascending
    public static int[] selection1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static int[] insertion(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
