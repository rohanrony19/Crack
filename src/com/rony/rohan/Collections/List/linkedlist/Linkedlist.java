package com.rony.rohan.Collections.List.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.get(2); // O(n)
        list.addLast(4);
        list.addFirst(0);
        System.out.println(list);
        list.getFirst();
        list.getLast();
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeIf(x-> x % 2 == 0);
        System.out.println(list);
        list.add(1,2);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat","Dog","Elephant"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Lion","Tiger","Elephant"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);
        animals.set(1,"Goat");
        System.out.println(animals);

        list.addLast(5);
        list.addLast(6);
        System.out.println(list);
        list.getLast(); //peek
        list.removeLast(); //pop
        list.size();
        list.isEmpty();
        System.out.println(list);

    }
}
