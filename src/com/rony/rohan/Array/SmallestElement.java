package com.rony.rohan.Array;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {68,54,19,6,72,44};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Smallest Element : " + min);
    }
}
