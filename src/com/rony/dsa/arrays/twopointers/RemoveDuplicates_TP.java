package com.rony.dsa.arrays.twopointers;

public class RemoveDuplicates_TP {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4};
        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[j] != arr[i]){
                j++;
                arr[j] = arr[i];
            }
        }
        System.out.println("New Length = " + (j+1));
    }
}
