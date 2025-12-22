package com.rony.dsa.arrays.twopointers;

import java.util.Arrays;

public class PartitionEvenOdd {
    public static void main(String[] args) {
        int[] arr = {3,8,5,12,7,6};
        int left = 0,right = arr.length - 1;

        while (left < right){
            if(arr[left] % 2 == 0) left++;
            else if (arr[right] % 2 != 0) right--;
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
