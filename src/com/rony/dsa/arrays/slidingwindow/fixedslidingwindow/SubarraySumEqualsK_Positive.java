package com.rony.dsa.arrays.slidingwindow.fixedslidingwindow;

public class SubarraySumEqualsK_Positive {
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,1};
        int k = 3;

        int i = 0,j = 0,sum = 0,count = 0;

        while (j < arr.length){
            sum += arr[j];

            while (sum > k){
                sum -= arr[i];
                i++;
            }
            if(sum == k)count++;

            j++;
        }

        System.out.println(count);
    }
}
