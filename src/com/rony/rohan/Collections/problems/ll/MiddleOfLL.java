package com.rony.rohan.Collections.problems.ll;

public class MiddleOfLL {
    static class Person {
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

        Person p5 = new Person();
        p5.name = "Rahul";

        p1.friend = p2;
        p2.friend = p3;
        p3.friend = p4;
        p4.friend = p5;

        Person middle = findMiddle(p1);
        System.out.println("Middle person: " + middle.name);




        
    }

    static Person findMiddle(Person head){

        if(head == null){
            return null;
        }
        Person slow = head;
        Person fast = head;

        while (fast != null && fast.friend !=null){
            slow = slow.friend;
            fast = fast.friend.friend;
        }
        return slow;
    }
}
