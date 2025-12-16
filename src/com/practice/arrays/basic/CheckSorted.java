package com.practice.arrays.basic;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        boolean sorted = true;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < arr[i-1]){
                sorted = false;
                break;
            }
        }
        System.out.println(sorted ? "Sorted" : "Not Sorted");
    }
}
