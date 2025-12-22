package com.rony.dsa.arrays.slidingwindow.fixedslidingwindow;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeK {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        Queue<Integer> q = new LinkedList<>();

        int i = 0,j = 0;

        while (j < arr.length){

            if(arr[j] < 0) q.add(arr[j]);

            if(j - i + 1 < k) j++;
            else {
                if(q.isEmpty()) System.out.print("0 ");
                else System.out.print(q.peek() + " ");

                if (arr[i] < 0) q.remove(arr[i]);

                i++;
                j++;
            }
        }
    }
}
