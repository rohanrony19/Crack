package com.rohan.NumberSystem;
import java.util.Scanner;
// 5*4*3*2*1
// Time Complexity = O(n)
// Space Complexity = O(1)
public class Factorial {
    public static long fact(int n){
        long fact = 1;
        for (int i = 2; i <= n; i++) {
                fact = fact * i ;
            }
        return fact;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get Factorial : ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + fact(n));
    }
    }

