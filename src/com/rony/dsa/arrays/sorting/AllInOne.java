package com.rony.dsa.arrays.sorting;

import java.util.Arrays;

public class AllInOne {
    public static void main(String[] args) {
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

    public static int[] bubble(int[] arr){
        //{8,5,1,2,3,4}
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

    // descending = 8,5,4,3,2,1
    public static int[] selection(int[] arr){
        //{8,5,1,2,3,4}
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

    // ascending = 1,2,3,4,5,8
    public static int[] selection1(int[] arr){
        //{8,5,1,2,3,4}
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
        //{8,5,1,2,3,4}
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
