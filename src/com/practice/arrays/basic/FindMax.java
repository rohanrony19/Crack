package com.practice.arrays.basic;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {5,8,20,1,44,6};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }

        for (int num : arr) {
            if (num > max) max = num;
        }

        System.out.println("Maximum: " + max);
    }
}
