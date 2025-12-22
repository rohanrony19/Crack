package com.rony.rohan.leetcode.easy;
import java.util.Stack;
// 232

public class QueueOfStacks {
    public static void main(String[] args) throws Exception {
        // Test QueueUsingStack (Amortized O(1))
        QueueUsingStack q1 = new QueueUsingStack();
        q1.add(1); q1.add(2); q1.add(3);
        System.out.println(q1.remove()); // 1
        System.out.println(q1.peek());   // 2

        // Test QueueUsingStacksRemove (O(1) add)
        QueueUsingStacksRemove q2 = new QueueUsingStacksRemove();
        q2.add(1); q2.add(2); q2.add(3);
        System.out.println(q2.remove()); // 1
        System.out.println(q2.peek());   // 2
    }

    // ✅ Approach 1: Amortized O(1) remove (Standard LeetCode)
    static class QueueUsingStack {
        private Stack<Integer> first;
        private Stack<Integer> second;

        public QueueUsingStack() {
            first = new Stack<>();
            second = new Stack<>();
        }

        public void add(int item) {
            first.push(item);
        }

        public int remove() throws Exception {
            moveToSecond();
            int removed = second.pop();
            moveBack();
            return removed;
        }

        public int peek() throws Exception {
            moveToSecond();
            int peeked = second.peek();
            moveBack();
            return peeked;
        }

        public boolean isEmpty() {
            return first.isEmpty();
        }

        private void moveToSecond() throws Exception {
            if (second.isEmpty()) {
                while (!first.isEmpty()) {
                    second.push(first.pop());
                }
            }
        }

        private void moveBack() throws Exception {
            while (!second.isEmpty()) {
                first.push(second.pop());
            }
        }
    }

    // ✅ Approach 2: O(1) add, O(n) remove
    static class QueueUsingStacksRemove {
        private Stack<Integer> first;
        private Stack<Integer> second;

        public QueueUsingStacksRemove() {
            first = new Stack<>();
            second = new Stack<>();
        }

        public void add(int item) throws Exception {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
            first.push(item);
            while (!second.isEmpty()) {
                first.push(second.pop());
            }
        }

        public int remove() throws Exception {
            return first.pop();
        }

        public int peek() throws Exception {
            return first.peek();
        }

        public boolean isEmpty() {
            return first.isEmpty();
        }
    }
}
