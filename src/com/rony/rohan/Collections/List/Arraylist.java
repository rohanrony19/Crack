package com.rony.rohan.Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        System.out.println(list); //1,4,3
        System.out.println(list.get(1)); //4
        System.out.println(list.size()); //
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove(2);
        for (int x:list){
            System.out.println(x);
        }
        System.out.println(list.contains(5));
        System.out.println(list.contains(1));
        list.add(2,3);
        System.out.println(list);
        list.add(2);
        System.out.println(list);
        list.set(2,5);
        System.out.println(list);

        List<String> list1 = Arrays.asList("Monday","Tuesday","Wednesday");
        System.out.println(list1);
        System.out.println(list1.getClass().getName());
//        list1.add("Thursday"); // we cannot add in asList
        list1.set(2,"Friday"); // But we can set/modify
        System.out.println(list1);

        String[] arr = {"rohan","teju","sonia"};
        List<String> list2 = Arrays.asList(arr);
        System.out.println(list2);
        List<String> list3 = new ArrayList<>(list2); // Here we can modify
        list3.add("mia");
        System.out.println(list3);

        List<String> list4 = new ArrayList<>();
        list4.add("Apple");
        list4.add("Mango");
        list4.add("Papaya");

        List<String> list5 = new ArrayList<>();
        list4.add("Grape");
        list4.add("Orange");
        list4.add("Melons");
        list5.addAll(list4);
        System.out.println(list5);
        list5.removeAll(list4);
        System.out.println(list4);
        System.out.println(list5);

        list.remove(Integer.valueOf(1));
        System.out.println(list);

        Collections.sort(list); // or
        list.sort(null); //comparator
        System.out.println(list);
    }
}
