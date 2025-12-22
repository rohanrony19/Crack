package com.rony.dsa.arrays.basic;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {6,4,99,12,2,32,69};
        int min = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : arr){
            if (num < min){
                second = min;
                min = num;
            } else if (num < second && num != min) {
                second = num;
            }
        }
        System.out.println("Second Smallest: " + second);
    }
}
