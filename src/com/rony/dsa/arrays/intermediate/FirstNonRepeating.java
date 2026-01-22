package com.rony.dsa.arrays.intermediate;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] args) {
        int[] arr = {4,5,4,6,5,7};

        Map<Integer,Integer> freq = new HashMap<>();
        for (int num:arr){
            freq.put(num,freq.getOrDefault(num,0) + 1);
        }

        for (int n:arr){
            
            if(freq.get(n) == 1){
                System.out.println("First non-repeating: " + n);
                break;
            }
        }
    }
}
