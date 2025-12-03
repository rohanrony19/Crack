package com.rohan.Patterns;

/*
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 *
 */
public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        p1(n);
    }

    static void p1(int n){
        for (int row = 0; row <= n * 2; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
