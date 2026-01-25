package com.rony.dsa.arrays.hashing;

import java.util.HashMap;
import java.util.Map;

//Print elements that appear more than once.
public class FIndDuplicates {
    public static void main(String[] args) {
        int[] arr ={1,2,3,2,1,4};

        Map<Integer,Integer> freq = new HashMap<>();

        for (int n:arr){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }

        for (Map.Entry<Integer,Integer> map : freq.entrySet()){
            if(map.getValue() > 1){
                System.out.println(map.getKey());
            }
        }
    }
}
