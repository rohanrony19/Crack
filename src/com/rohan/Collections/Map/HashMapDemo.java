package com.rohan.Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Pooja");
        hashMap.put(2,"Suraj");
        hashMap.put(3,"Raj");
//        hashMap.put(null,"raji");
//        hashMap.put(4,null);
//        hashMap.put(5,null);
        System.out.println(hashMap);

        String student = hashMap.get(3);
        System.out.println(student);
        String roll = hashMap.get(69);
        System.out.println(roll);

        System.out.println(hashMap.containsKey(2));
        System.out.println(hashMap.containsValue("raj"));

        Set<Integer> keys = hashMap.keySet();
        for (int i : keys){
            System.out.println(hashMap.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();

        for (Map.Entry<Integer, String> entry:entries){
            System.out.println(entry.getKey() + " " + entry.getValue().toUpperCase());
        }

        System.out.println(hashMap);
        hashMap.remove(3,"nithin");
        System.out.println(hashMap);
    }
}
