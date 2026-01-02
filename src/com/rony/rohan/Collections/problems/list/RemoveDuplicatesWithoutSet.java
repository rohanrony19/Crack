package com.rony.rohan.Collections.problems.list;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesWithoutSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        List<Integer> l1 = new ArrayList<>();
        for (Integer n:list){
            if(!l1.contains(n)){
                l1.add(n);
            }
        }
        System.out.println("Basic approach: " + l1);

        RemoveDuplicatesWithoutSet obj = new RemoveDuplicatesWithoutSet();

        List<Integer> copiedList = new ArrayList<>(list); //creating copy
        List<Integer> result = obj.advance(copiedList); // using advance method
        System.out.println(result);
        // In short
        List<Integer> res = obj.advance(new ArrayList<>(list));
        System.out.println("Advance approach: " + res);
    }

    public List<Integer> advance(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                    j--;
                }
            }
        }
        return list;
    }
}
