package com.rony.dsa.arrays.prefixsum;

import java.util.Arrays;

public class PrefixSumArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8};
        /*
                    2           = 2
                    2+4         = 6
                    2+4+6       = 12
                    2+4+6+8     = 20
                                => [2,6,12,20]
         */
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];


        
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        System.out.println(Arrays.toString(prefix));
    }
}
