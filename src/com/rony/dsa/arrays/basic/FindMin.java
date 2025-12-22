package com.rony.dsa.arrays.basic;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {6,4,99,12,2,32,69};
        int min = arr[0];

        for (int num:arr){
            if (num<min) min = num;
        }

        System.out.println("Minimum: " + min);
    }
}
