package com.rony.dsa.arrays.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,4,6};
        int target = 4;
        System.out.println(linear(arr,target));
    }

    public static int linear(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
