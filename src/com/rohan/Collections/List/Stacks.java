package com.rohan.Collections.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        Integer removedElement = stack.pop();
        System.out.println(stack);
        Integer peek = stack.peek();
        System.out.println(peek); // to see the last element
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        stack.add(0,0);
        System.out.println(stack);

        int search = stack.search(4);
        System.out.println(search);
        // 5 = index-0
        // 4 = index-1
        // 3 = index-2
        // 2 = index-3
        // 1 = index-4
        // 0 = index-5

        LinkedList<Integer> list = new LinkedList<>(stack);
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
