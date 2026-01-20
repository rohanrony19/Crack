package com.rony.rohan.Collections.problems.ll;

public class Base {
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

        p1.friend = p2;
        p2.friend = p3;

        System.out.println("Person 1 : " + p1.name);
        System.out.println("Person 1's friend : " + p1.friend.name);
        System.out.println("Person 1's friend friend : " + p1.friend.friend.name);

        System.out.println("Person 2 : " + p2.name);
        System.out.println("Person 2's friend : " + p2.friend.name);

        System.out.println("Person 3 : " + p3.name);
        System.out.println("Person 3's friend : " + p3.friend);

        int count = countPersons(p1);
        System.out.println("Total persons : " + count);
    }



    static int countPersons(Person head){
        int count = 0;
        Person current = head;

        while (current != null){
            count++;
            current = current.friend;
        }
        return count;
    }
}

