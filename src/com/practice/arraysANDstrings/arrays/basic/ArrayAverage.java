package com.practice.arraysANDstrings.arrays.basic;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;

        for (int num:arr){
            sum += num;
        }

        double avg = (double) sum / arr.length;
        System.out.println("Average: " + avg);
    }
}
