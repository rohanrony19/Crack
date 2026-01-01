package com.rony.rohan.Collections.problems.list;

import java.util.ArrayList;
import java.util.List;

public class Level1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1); // Duplicates allowed
        System.out.println(list);

        System.out.println("------------------------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-------------------------");

        for (int n:list){
            System.out.println(n);
        }

        System.out.println("--------------------------");

        System.out.println(list.get(2));

        System.out.println(list.set(1,6));

        System.out.println(list.remove(list.size()-1));
        System.out.println(list);

        list.remove(Integer.valueOf(3));
        System.out.println(list);

        System.out.println("Size: " + list.size());

        System.out.println(list.contains(90));


    }
}
