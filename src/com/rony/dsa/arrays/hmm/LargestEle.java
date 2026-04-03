package com.rony.dsa.arrays.hmm;

public class LargestEle {
    public static void main(String[] args) {
        int[] arr = {10,20,3,40,12,25};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum: " + max);
    }
}
