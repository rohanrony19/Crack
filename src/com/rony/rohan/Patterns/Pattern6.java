package com.rony.rohan.Patterns;

/*
        *
      * *
    * * *
  * * * *
* * * * *
 */
public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        p6(n);
    }

    static void p6(int n){
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }
    }
}
