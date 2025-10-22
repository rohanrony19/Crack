package com.rohan.Collections.Queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // natural ordering
        // custom comparator for customised ordering
        // does not allow null elements
        PriorityQueue<Integer> pq = new PriorityQueue<>((x,y)->y-x);
        pq.add(15);
        pq.add(20);
        pq.add(25);
        pq.add(30);
        System.out.println(pq); // not sorted
        System.out.println(pq.remove()); //15
        System.out.println(pq.peek());  //20


        while (!pq.isEmpty()){
            System.out.println(pq.poll()); // 20,25,30
        }

    }
}

