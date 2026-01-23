package com.rony.dsa.arrays.intermediate;

import java.util.Arrays;

public class ArraysEqual {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3, 4};

        // standard
        System.out.println("Arrays.equal: " + Arrays.equals(a, b));

        //manual
        System.out.println("Manual check: " + areArrayEqual(a,b));
        
    }

    public static boolean areArrayEqual(int[] a,int[] b){
        if(a.length != b.length){
           return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
