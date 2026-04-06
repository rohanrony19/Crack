package com.rony.dsa.arrays.hmm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};

        HashSet<Integer> set = new HashSet<>();

        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                arr[idx++] = arr[i];
            }
        }

        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
