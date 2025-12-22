package com.rony.dsa.arrays.basic;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 12, 9, 21, 30};
        int target = 21;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                System.out.println("Found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Not found");
    }
}
