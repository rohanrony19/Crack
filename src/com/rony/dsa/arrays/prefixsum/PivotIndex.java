package com.rony.dsa.arrays.prefixsum;

public class PivotIndex {
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};

        int total = 0;
        for(int x : arr) total += x;

        int left = 0;

        for(int i = 0; i < arr.length; i++) {
            if(left == total - left - arr[i]) {
                System.out.println(i);
                return;
            }
            left += arr[i];
        }
    }
}
