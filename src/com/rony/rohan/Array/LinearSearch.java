package com.rony.rohan.Array;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 5, 3};
        int target = 5;
        boolean isfound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found at index: " + i);
                isfound = true;
                break;
            }
        }
        if(!isfound){
            System.out.println("Not Found");
        }
    }
}
