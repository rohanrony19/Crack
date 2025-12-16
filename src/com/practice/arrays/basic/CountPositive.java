package com.practice.arrays.basic;

public class CountPositive {
    public static void main(String[] args) {
        int[] arr = {10, -5, 20, -7, 30};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                count++;
            }
        }
        System.out.println("Positive count: " + count);
    }
}
