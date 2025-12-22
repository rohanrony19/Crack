package com.rony.rohan.Array;

public class CountFrequency {
    public static void main(String[] args) {
        int[] arr = {2,5,2,6,2,7};
        int target = 2;
        int count = 0;
        for (int num:arr){
            if(num == target){
                count++;
            }
        }
        System.out.println("Frequency : " + count);
    }
}
