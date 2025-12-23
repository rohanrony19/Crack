package com.rony.dsa.arrays.prefixsum;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {-7,1,5,2,-4,3,0};

        int total = 0;
        for(int x : arr) total += x;

        int leftSum = 0;

        for(int i = 0; i < arr.length; i++) {
            total -= arr[i];

            if(leftSum == total) {
                System.out.println("Index = " + i);
                break;
            }

            leftSum += arr[i];
        }
    }
}
