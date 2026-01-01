package com.rony.rohan.Collections.problems.ll;

public class InsertAtEnd {
    static class Person{
        String name;
        Person friend;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Pinky";

        Person p2 = new Person();
        p2.name = "Rohan";

        Person p3 = new Person();
        p3.name = "Spandy";

        Person p4 = new Person();
        p4.name = "Kishan";

        p1.friend = p2;
        p2.friend = p3;
        p3.friend = p4;

        insertAtEnd(p1,"Suji");

        printList(p1);
    }

    static Person insertAtEnd(Person head,String name){
        Person newPerson = new Person();
        newPerson.name = name;

        if(head == null) {
            return newPerson;
        }

        Person current = head;

        while (current.friend != null){
            current = current.friend;
        }
        current.friend = newPerson;
        return head;
    }

    static void printList(Person head){
        Person current = head;
        while (current != null){
            System.out.print(current.name + "->");
            current = current.friend;
        }
        System.out.println("null");
    }
}
