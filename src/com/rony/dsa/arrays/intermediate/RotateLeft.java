package com.rony.dsa.arrays.intermediate;

import java.util.Arrays;

public class RotateLeft {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 2;
        int n = arr.length;

        int[] rotate = new int[n];

        for (int i = 0; i < n; i++) {
            rotate[i] = arr[(i+k) % n]; // 2+0 % 5 = 3
            /*
            i=0, r[i] = r[0],a[(0+2)%5] = a[2],  r[0] = a[2]
            i=1, r[i] = r[1],a[(1+2)%5] = a[3],  r[1] = a[3]
            i=2, r[i] = r[2],a[(2+2)%5] = a[4],  r[2] = a[4]
            i=3, r[i] = r[3],a[(3+2)%5] = a[0],  r[3] = a[0]
            i=4, r[i] = r[4],a[(4+2)%5] = a[1],  r[4] = a[1]
             */
        }
        System.out.println(Arrays.toString(rotate)); //3,4,5,6,7,8,1,2
    }
}
