package com.rohan.Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(3); //enqueue
        list.addFirst(2);
        list.addFirst(1);
        list.add(5);
        System.out.println(list);
        list.removeLast(); // dequeue
        list.removeFirst();
        System.out.println(list);
        list.addLast(69);
        list.addLast(70);
        System.out.println(list);
        list.getFirst(); // peek

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);

        System.out.println(queue.size());

        System.out.println(queue.remove()); // throws exception if empty
        System.out.println(queue.poll());

        System.out.println(queue.element()); // throws exception if empty
        System.out.println(queue.peek());

        Queue<Integer> queue1 = new ArrayBlockingQueue<>(2);
        queue1.add(1);
        System.out.println(queue1.offer(2));
//        queue1.add(3); exception if full
        System.out.println(queue1.offer(3));




    }
}
