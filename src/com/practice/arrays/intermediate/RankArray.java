package com.practice.arrays.intermediate;

import java.util.Arrays;
import java.util.HashMap;

public class RankArray {
    public static void main(String[] args) {
        int[] arr = {40,10,30,20};
        int[] copy = arr.clone();

        Arrays.sort(copy);

        HashMap<Integer,Integer> map = new HashMap<>();
        int rank = 1;
        for (int x:copy) map.put(x,rank++);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        System.out.println(Arrays.toString(arr));
    }
}
