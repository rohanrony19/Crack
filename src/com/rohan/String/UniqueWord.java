package com.rohan.String;

import java.util.HashMap;

public class UniqueWord {
    public static void main(String[] args) {
        String sentence = "this is test this is";
        String[] words = sentence.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for (String word:words){
            map.put(word,map.getOrDefault(word,0) + 1);
        }
        for (String w: map.keySet()){
            if(map.get(w) == 1){
                System.out.println("First unique word "+w);
                return;
            }
        }
        System.out.println("No unique word");
    }
}
