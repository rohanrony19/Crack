package com.practice.arrays.intermediate;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int n = 5;

        int sum = n * (n+1) / 2; // 15
        int arrSum = 0; // 1+2+4+5=12

        for (int num:arr){
            arrSum += num;
        }

        int res = sum - arrSum; // 15 - 12 = 3
        System.out.println("Missing Number: " + res);
    }
}
