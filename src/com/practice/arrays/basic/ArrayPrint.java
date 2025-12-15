package com.practice.arrays.basic;

public class ArrayPrint {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int num:arr){
            System.out.print(num + " ");
        }
    }
}
