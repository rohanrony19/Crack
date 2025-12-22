package com.rony.dsa.recursion.basic;

public class TowerOfHanoi {
    static void move(int n,char src, char helper,char dest){
        if(n == 1){
            System.out.println("Move disk 1 from " + src + " to " + dest);
            return;
        }

        move(n-1,src,dest,helper);
        System.out.println("Move disk " + n + " from " + src + " to " + dest);
        move(n-1,helper,src,dest);
    }

    public static void main(String[] args) {
        move(3,'A','B','C');
    }
}
