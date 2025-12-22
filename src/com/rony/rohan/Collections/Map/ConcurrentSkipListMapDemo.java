package com.rony.rohan.Collections.Map;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String,Integer> map = new ConcurrentSkipListMap<>();
        map.put("Apple",2);
        map.put("Grape",4);
        map.put("Banana",6);
        map.put("Mango",8);
        System.out.println(map);
        // same as ConcurrentHashMap But its Sorted
    }
}
