package com.rohan.Patterns;

/*
* * * * *
* * * *
* * *
* *
*
 */
public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        p3(n);
    }
    static void p3(int n){
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
