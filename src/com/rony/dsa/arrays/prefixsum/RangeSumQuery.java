package com.rony.dsa.arrays.prefixsum;

public class RangeSumQuery {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};

        // create prefix sum
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++)
            prefix[i] = prefix[i-1] + arr[i];

        int L = 1, R = 3; // 4 + 6 + 8 = 18
        int sum = prefix[R] - (L > 0 ? prefix[L-1] : 0);

        System.out.println("Sum = " + sum);
    }
}
