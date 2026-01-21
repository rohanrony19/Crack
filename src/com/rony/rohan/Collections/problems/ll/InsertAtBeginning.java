package com.rony.rohan.Collections.problems.ll;

public class InsertAtBeginning {
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

        // Link them
        p1.friend = p2;
        p2.friend = p3;

        Person head = insertAtBeginning(p1,"Pinky");

        printList(head);
    }




    

    public static Person insertAtBeginning(Person head,String name){
        Person newPerson = new Person();
        newPerson.name = name;

        newPerson.friend = head;
        return newPerson;
    }

    public static void printList(Person head){
        Person current = head;

        while (current!=null){
            System.out.print(current.name + "->");
            current = current.friend;
        }
        System.out.println("null");
    }
}
