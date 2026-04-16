package com.rony.dsa.arrays.hmm;

import java.util.Arrays;

public class CheckSubsetOfOther {
    public static void main(String[] args) {
        int[] a = {11, 1, 13, 21, 3, 7};
        int[] b = {11,3};

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0;
        int m = a.length, n = b.length;

        while (i < m && j < n) {

            if (a[i] < b[j]) {
                // move in a to catch up
                i++;
            }
            else if (a[i] == b[j]) {
                i++;
                // matched one element from b
                j++;
            }
            else {
                // a[i] > b[j] → means b[j] is missing
                System.out.println(-1);
                return;
            }
        }

        // all b[] matched
        System.out.println(j==n);
    }
}
