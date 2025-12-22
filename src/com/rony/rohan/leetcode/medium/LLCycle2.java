package com.rony.rohan.leetcode.medium;

// 142
/*
Example 1:
Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.

Example 2:
Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node.

Example 3:
Input: head = [1], pos = -1
Output: no cycle
Explanation: There is no cycle in the linked list.
 */

public class LLCycle2 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                length = lengthCycle(slow);
                break;
            }
        }
        if(length == 0){
            return null;
        }
        // find the start
        ListNode f = head;
        ListNode s = head;

        while (length > 0){
            s = s.next;
            length--;
        }

        // keep moving both forward and they  will meet at cycle start
        while (f != s){
            f = f.next;
            s = s.next;
        }
        return s;
    }

    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                // calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                }while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        LLCycle2 sol = new LLCycle2();

        // Test Case 1: Cycle starts at index 1
        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(0);
        head1.next.next.next = new ListNode(-4);
        head1.next.next.next.next = head1.next;  // Cycle: 2 -> 0 -> -4 -> 2

        ListNode result1 = sol.detectCycle(head1);
        System.out.println("Test 1: " + (result1 != null ? result1.val : "null"));
        // Output: 2 ✓

        // Test Case 2: No cycle
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);

        ListNode result2 = sol.detectCycle(head2);
        System.out.println("Test 2: " + (result2 != null ? result2.val : "null"));
        // Output: null ✓

        // Test Case 3: Single node cycle
        ListNode head3 = new ListNode(1);
        head3.next = head3;  // Self-loop

        ListNode result3 = sol.detectCycle(head3);
        System.out.println("Test 3: " + (result3 != null ? result3.val : "null"));
        // Output: 1 ✓
    }
}
