package com.rony.dsa.arrays.sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortByFrequency {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3};

        Map<Integer,Integer> freq  = new HashMap<>();

        for (int x:arr){
            freq.put(x,freq.getOrDefault(x,0) + 1);
          /*
            freq.put(1,freq.getOrDefault(1,0) + 1); , freq.put(1,0+1) bcz frq doesn't contain 1 it return default 1
            freq.put(1,freq.getOrDefault(1,1) + 1); , freq.put(1,1+1) bcz frq contain 1 it return 2
            freq.put(2,freq.getOrDefault(2,0) + 1); , freq.put(2,0+1) bcz frq doesn't contain 2 it return default 1
            freq.put(2,freq.getOrDefault(2,1) + 1); , freq.put(2,1+1) bcz frq contain 2 it return 2
            freq.put(2,freq.getOrDefault(2,2) + 1); , freq.put(2,2+1) bcz frq contain 2 it return 3
            freq.put(3,freq.getOrDefault(3,0) + 1); , freq.put(3,0+1) bcz frq doesn't contain 3 it return default 1
            [1,2]
            [2,3]
            [3,1]
           */
        }

        Integer[] boxed = Arrays.stream(arr).boxed().toArray(Integer[]::new); // Integer = [1,1,2,2,2,3]

        Arrays.sort(boxed,(a,b)->{ // [3,1,1,2,2,2]
            if (freq.get(a) == freq.get(b)){
                return a-b;
            }
            return freq.get(a) - freq.get(b);
        });

        System.out.println(Arrays.toString(boxed)); // 3,1,1,2,2,2
    }
}
