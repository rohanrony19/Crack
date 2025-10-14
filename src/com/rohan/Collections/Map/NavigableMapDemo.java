package com.rohan.Collections.Map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer,String> map = new TreeMap<>();
        map.put(1,"One");
        map.put(5,"Five");
        map.put(3,"Three");
        System.out.println(map);
        System.out.println(map.lowerKey(4));
        System.out.println(map.ceilingKey(4));
        System.out.println(map.higherKey(1));
        System.out.println(map.higherEntry(3));
        System.out.println(map.descendingMap());
        System.out.println(map.descendingKeySet());
    }
}
