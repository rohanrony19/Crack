package com.practice.arrays.basic;

public class CountEven {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 9, 10};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        System.out.println("Even count: " + count);
    }
}
