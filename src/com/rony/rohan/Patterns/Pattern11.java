package com.rony.rohan.Patterns;
/*
0 0 0 0 0 0 0 0 0
0 1 1 1 1 1 1 1 0
0 1 2 2 2 2 2 1 0
0 1 2 3 3 3 2 1 0
0 1 2 3 4 3 2 1 0
0 1 2 3 3 3 2 1 0
0 1 2 2 2 2 2 1 0
0 1 1 1 1 1 1 1 0
0 0 0 0 0 0 0 0 0
 */
public class Pattern11 {
    public static void main(String[] args) {
        p11(4);
    }

    static void p11(int n){
        n = 2 * n;
        for (int row = 1; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = Math.min(Math.min(row,col),Math.min(n - row,n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
