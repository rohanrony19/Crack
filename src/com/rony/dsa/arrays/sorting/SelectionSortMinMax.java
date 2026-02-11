package com.rony.dsa.arrays.sorting;

public class SelectionSortMinMax {
    public static void main(String[] args) {
        int[] arr = {4,8,2,6,1,0,5};

        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int minIndex = start;
            int maxIndex = start;

            for (int i = start; i <= end; i++) {
                if (arr[minIndex] > arr[i]){
                    minIndex = i;
                }
                if (arr[maxIndex] < arr[i]){
                    maxIndex = i;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[start];
            arr[start] = temp;

            if (maxIndex == start){
                maxIndex = minIndex;
            }

            temp = arr[end];
            arr[end] = arr[maxIndex];
            arr[maxIndex] = temp;

            start++;
            end--;
        }

    }
}
