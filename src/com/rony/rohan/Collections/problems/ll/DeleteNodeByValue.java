package com.rony.rohan.Collections.problems.ll;

public class DeleteNodeByValue {
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

        String sym = "->";
        System.out.println(p1.name + sym + p1.friend.name + sym + p1.friend.friend.name + sym + p1.friend.friend.friend.name + sym + p1.friend.friend.friend.friend);

        Person head = deleteByValue(p1,p2.name);

        printList(head);
    }

    static Person deleteByValue(Person head,String name){
        if(head == null){
            return null;
        }

        if(head.name.equals(name)){
            return head.friend;
        }

        Person current = head;

        while (current.friend != null && !current.friend.name.equals(name)){
            current = current.friend;
        }

        if (current.friend != null){
            current.friend = current.friend.friend;
        }

        return head;
    }

    static void printList(Person head){
        Person cur = head;
        while (cur != null){
            System.out.print(cur.name + "->");
            cur = cur.friend;
        }
        System.out.println("null");
    }
}
