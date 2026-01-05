package com.rony.rohan.Collections.problems.ll;

public class Reverse {
    static class Person{
        String name;
        Person friend;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Rohan";

        Person p2 = new Person();
        p2.name = "Amit";

        Person p3 = new Person();
        p3.name = "Spandy";

        Person p4 = new Person();
        p4.name = "Pinky";

        p1.friend = p2;
        p2.friend = p3;
        p3.friend = p4;

        System.out.println("Before Reverse:");
        printList(p1);

        Person head = reverseList(p1);

        System.out.println("After Reverse:");
        printList(head);
    }

    static Person reverseList(Person head){
        Person prev = null;
        Person current = head;

        while (current != null){
            Person next = current.friend; // 1️⃣ save next
            current.friend = prev;        // 2️⃣ reverse link
            prev = current;               // 3️⃣ move prev
            current = next;               // 4️⃣ move current
        }
        return prev;
    }

    static void printList(Person head){
        Person curr = head;
        while (curr != null){
            System.out.print(curr.name + "->");
            curr = curr.friend;
        }
        System.out.println("null");
    }
}
