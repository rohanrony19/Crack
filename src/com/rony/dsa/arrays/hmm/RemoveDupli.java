package com.rony.dsa.arrays.hmm;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDupli {
    public static void main(String[] args) {
        String s = "geeksforgeeks";

        Set<Character> set = new TreeSet<>();

        for (char ch :s.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
            }
        }

        for(Character m:set){
            System.out.print(m);
        }
    }
}
