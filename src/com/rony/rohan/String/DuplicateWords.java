package com.rony.rohan.String;

import java.util.HashMap;

public class DuplicateWords {
    public static void main(String[] args) {
        String sentence = "this is is a test test";
        String[] words = sentence.split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        for (String w : map.keySet()) {
            if (map.get(w) > 1) {
                System.out.println(w + " → " + map.get(w));
            }
        }
    }
}
