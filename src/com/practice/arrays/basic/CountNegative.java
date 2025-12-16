package com.practice.arrays.basic;

public class CountNegative {
    public static void main(String[] args) {
        int[] arr = {10, -5, 20, -7, 30};
        int countNegative = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                countNegative++;
            }
        }
        System.out.println("Negative count: " + countNegative);
    }
}
