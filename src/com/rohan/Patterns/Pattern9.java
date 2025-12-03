package com.rohan.Patterns;
/*
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
 */
public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;
        p9(n);
    }

    static void p9(int n){
        for (int row = 1; row <= n; row++) {
            // Print leading spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }

            // Print stars
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row ; col++) {
                System.out.print(col + " ");
            }
            // Move to next line
            System.out.println();
        }
    }
}
