package com.rony.rohan.Patterns;

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
public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
        p7(n);
    }

    static void p7(int n){
        for (int row = 0; row <= n * 2; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
