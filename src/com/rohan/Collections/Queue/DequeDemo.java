package com.rohan.Collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        // double-ended queue
        // allows insertion and removal of elements from both ends

        Deque<Integer> deque1 = new ArrayDeque<>(); // faster iteration, low memory, no null allowed
        deque1.addFirst(10);
        deque1.addLast(20);
        deque1.offerFirst(5);
        deque1.offerLast(25);
        System.out.println(deque1); // 5,10,20,25
        System.out.println("First Element: " + deque1.getFirst());
        System.out.println("Last Element: " + deque1.getLast());
        deque1.removeFirst(); // remove 5
        deque1.pollLast(); // remove 25
        for (int i:deque1){
            System.out.print(i + " ");
        }

        Deque<Integer> deque2 = new LinkedList<>(); // insertion , deletion
    }
}
