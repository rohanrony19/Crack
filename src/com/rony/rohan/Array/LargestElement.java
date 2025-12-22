package com.rony.rohan.Array;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {23,56,78,19,48};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
        }
        }
        System.out.println("Maximum Element " + max);
    }
}
