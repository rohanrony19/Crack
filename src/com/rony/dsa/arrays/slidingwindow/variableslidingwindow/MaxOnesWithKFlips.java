package com.rony.dsa.arrays.slidingwindow.variableslidingwindow;

public class MaxOnesWithKFlips {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1};
        int k = 1;

        int i = 0, zero = 0, max = 0;

        for(int j = 0; j < arr.length; j++) {
            if(arr[j] == 0) zero++;

            while(zero > k) {
                if(arr[i] == 0) zero--;
                i++;
            }

            max = Math.max(max, j - i + 1);
        }

        System.out.println(max);
    }
}
