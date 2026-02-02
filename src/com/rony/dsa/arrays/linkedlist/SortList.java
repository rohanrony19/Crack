package com.rony.dsa.arrays.linkedlist;

public class SortList {
    public static void main(String[] args) {

    }

    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node mid = getMid(head);
        Node RightHead = mid.next;
        mid.next = null;

        Node left
    }
}
