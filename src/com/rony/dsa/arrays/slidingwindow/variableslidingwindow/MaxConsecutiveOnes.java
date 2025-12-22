package com.rony.dsa.arrays.slidingwindow.variableslidingwindow;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        int k = 0;

        int i = 0, zeroCount = 0, max = 0;

        for(int j = 0; j < arr.length; j++) {
            if(arr[j] == 0) zeroCount++;

            while(zeroCount > k) {
                if(arr[i] == 0) zeroCount--;
                i++;
            }

            max = Math.max(max, j - i + 1);
        }

        System.out.println(max);
    }
}
