package com.rohan.Collections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>(11,0.3f,true);
        map.put("Orange",10);
        map.put("Apple",20);
        map.put("Grape",30);
        map.get("Apple");
        map.get("Orange");
        // ordered list
        for (Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("-----------------------");

        HashMap<String ,Integer> hashMap = new HashMap<>();
        hashMap.put("Orange",10);
        hashMap.put("Apple",20);
        hashMap.put("Grape",30);

        Integer res = hashMap.getOrDefault("Appl",0);
        System.out.println(res);
        // unordered list
        for (Map.Entry<String,Integer> entry: hashMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
