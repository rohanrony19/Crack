package com.rony.dsa.arrays.hashing;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] args) {
        int[] arr = {4, 5, 4, 6, 5, 7};

        Map<Integer,Integer> map = new HashMap<>();

        for (int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for (int n:arr){
            if(map.get(n) == 1){
                System.out.println("First Non Repeating Element: " + n);
                return;
            }
        }
    }
}
