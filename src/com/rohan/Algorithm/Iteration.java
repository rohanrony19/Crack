package com.rohan.Algorithm;
// Iteration : A set of instruction is repeated using loops(for,while,do-while)
// Print 1 to 5 = 1,2,3,4,5
// Time Complexity = O(n)
// Space Complexity = O(1)

public class Iteration {
    static boolean Digit(){
        int n =5;
        for (int i = 1; i <= n; i++) { //Iteration
            System.out.println(i);
        }
        return false;
    }
    public static void main(String[] args) {
        Digit();
    }
}
