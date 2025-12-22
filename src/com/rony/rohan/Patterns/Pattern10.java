package com.rony.rohan.Patterns;
/*
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
  4 3 2 1 2 3 4
    3 2 1 2 3
      2 1 2
        1
 */
public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;
        p10(n);
    }

    static void p10(int n){
        for (int row = 1; row <= 2 * n; row++) {

            int c = row > n ? 2 * n - row : row;
            // Print leading spaces
            for (int space = 0; space < n - c; space++) {
                System.out.print("  ");
            }

            // Print stars
            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c ; col++) {
                System.out.print(col + " ");
            }
            // Move to next line
            System.out.println();
        }
    }
}
