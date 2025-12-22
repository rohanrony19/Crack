package com.rony.dsa.arrays.intermediate;

import java.util.Arrays;

public class ArraysEqual {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {1,2,3};

        System.out.println(Arrays.equals(a,b));
        // or
        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]){
                System.out.println("not match");
                break;
            }
        }
        System.out.println("match");
    }
}
