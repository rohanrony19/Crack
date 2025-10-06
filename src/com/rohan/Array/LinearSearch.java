package com.rohan.Array;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 4;
        boolean isfound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                isfound = true;
                break;
            }
        }
        System.out.println(isfound? target + " Found" :target +" Not Found");
    }
}
