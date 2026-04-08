package com.rony.dsa.arrays.hmm;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr= {12, 35, 1, 10, 34, 1};
        int max = Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                second = max;
                max = arr[i];
            } else if (arr[i] > second && arr[i] != max) {
                second = arr[i];
            }
        }
        System.out.println("max: " + max + " , second max: " + second);
    }
}
