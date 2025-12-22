package com.rony.dsa.arrays.slidingwindow.variableslidingwindow;

public class SubarrayProductLessThanK {
    public static void main(String[] args) {
        int[] arr = {10,5,2,6};
        int k = 100;

        int prod = 1, i = 0, count = 0;

        for(int j = 0; j < arr.length; j++) {
            prod *= arr[j];

            while(prod >= k) {
                prod /= arr[i];
                i++;
            }

            count += (j - i + 1);
        }
        System.out.println(count);
    }
}
