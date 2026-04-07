package com.rony.dsa.arrays.hmm;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] a = new int[arr.length];

        int k=0;
        for (int i=arr.length-1;i>=0;i--){
            a[k++] = arr[i];
        }

        System.out.println(Arrays.toString(a));
    }
}
