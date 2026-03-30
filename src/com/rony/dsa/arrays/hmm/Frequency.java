package com.rony.dsa.arrays.hmm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        int[] arr={10,20,10,5,20};

        Map<Integer,Integer> map = new HashMap<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a,b)->a.getKey()-b.getKey());

        for(Map.Entry<Integer,Integer> m:list){
            System.out.println(m.getKey() + " " + m.getValue());
        }



    }
}
