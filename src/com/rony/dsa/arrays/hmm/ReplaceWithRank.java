package com.rony.dsa.arrays.hmm;

import java.util.*;

public class ReplaceWithRank {
    public static void main(String[] args) {
        int[] arr = {100,5,70,2};

        int[] temp = arr.clone();
        Arrays.sort(temp);

        Map<Integer,Integer> map = new HashMap<>();
        int rank = 1;

        for(int num:temp){
            if(!map.containsKey(num)){
                map.put(num,rank++);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        System.out.println(Arrays.toString(arr));
    }
}
