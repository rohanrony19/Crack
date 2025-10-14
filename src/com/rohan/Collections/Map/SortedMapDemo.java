package com.rohan.Collections.Map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer,String > map = new TreeMap<>((a,b)->b-a);
        map.put(91,"sonia");
        map.put(36,"raj");
        map.put(88,"teju");
        map.put(44,"ravi");
        System.out.println(map);

        System.out.println(map.firstKey());
        System.out.println(map.entrySet());
        System.out.println(map.lastKey());
        System.out.println(map.headMap(90));
        System.out.println(map.tailMap(68));
//        System.out.println(map.subMap(68,90));

        SortedMap<String,Integer> map1 = new TreeMap<>();
        map1.put("Rohan",78);
        map1.put("Ajith",45);
        map1.put("sonia",62);
        map1.put("ravi",55);
        System.out.println(map1);
    }
}
