package com.rony.dsa.arrays.basic;

public class MinIndex {
    public static void main(String[] args) {
        int[] arr = {10,50,20,40};
        int min = arr[0];
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        System.out.println("Index: " + index);
    }
}
