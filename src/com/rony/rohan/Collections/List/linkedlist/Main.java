package com.rony.rohan.Collections.List.linkedlist;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(100,3);

        list.display();
        System.out.println(list.deleteFirst());
//        list.deleteFirst();
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        list.insertRec(88,2);
        list.display();



//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.insert(8,65);
//
//        list.display();

//        CLL list = new CLL();
//        list.insert(34);
//        list.insert(4);
//        list.insert(3);
//        list.insert(26);
//        list.display();
//        list.delete(3);
//        list.display();

    }
}
