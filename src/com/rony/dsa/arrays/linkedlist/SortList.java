package com.rony.dsa.arrays.linkedlist;

public class SortList {
    Node head;
    Node tail;

    public static void main(String[] args) {
        SortList ll = new SortList();
        ll.addLast(40);
        ll.addLast(80);
        ll.addLast(50);
        ll.addLast(10);
        ll.addLast(90);
        ll.addLast(20);
        ll.addLast(60);
        ll.addLast(30);

        ll.print();

        ll.head = ll.mergeSort(ll.head);

        ll.print();
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = head;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node mid = getMid(head);
        Node RightHead = mid.next;
        mid.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(RightHead);

        return merge(left,right);
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

    

    Node merge(Node a,Node b){
        if(a == null) return b;

        if (b == null) return a;

        if(a.data <= b.data){
            a.next = merge(a.next,b);
            return a;
        }else {
            b.next = merge(a,b.next);
            return b;
        }
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
