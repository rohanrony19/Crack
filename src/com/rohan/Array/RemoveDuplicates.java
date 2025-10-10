package com.rohan.Array;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,4,4,4,5,5};
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        for (int i = 0; i <= j ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
