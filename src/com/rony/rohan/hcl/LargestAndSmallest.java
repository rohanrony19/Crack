package com.rony.rohan.hcl;

public class LargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {3,2,7,5,1,8,4};
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            } else if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}
