package com.rony.dsa.arrays.basic;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {6,4,99,12,2,32,69};
        int max = Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : arr){
            if (num > max) {
                second = max;
                max = num;
            } else if (num > second && num != max) {
                second = num;
            }
        }
        System.out.println("Second Largest: " + second);
    }
}
