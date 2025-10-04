package com.rohan.Array;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        boolean isSorted = true;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted ? "Array is sorted" : "Array is not sorted");
    }
}
