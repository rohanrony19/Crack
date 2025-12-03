package com.rohan.Algorithm.recursion;

//public class Recursion {
//    public static void main(String[] args) {
//        digit(1);
//    }
//
//    static void digit(int n){
//        System.out.println(n);
//        digit2(2);
//    }
//    static void digit2(int n){
//        System.out.println(n);
//        digit3(3);
//    }
//    static void digit3(int n){
//        System.out.println(n);
//        digit4(4);
//    }
//    static void digit4(int n){
//        System.out.println(n);
//        digit5(5);
//    }
//    static void digit5(int n){
//        System.out.println(n);
//    }
//}

// instead we use recursion
// Print 1 to 5 = 1,2,3,4,5
// Recursion : A function that calls itself until a base condition met.
// Time Complexity = O(n)
// Space Complexity = O(n)


public class Recursion {
    public static void main(String[] args) {
//            digit(1);
            dig(5);
        }
        static void digit(int n){
            if(n>5){     // Base condition
                return;
            }
            System.out.println(n);
            digit(n+1);   // Recursion
        }
        static void dig(int n){
            if(n == 0){
                return;
            }
            System.out.println(n);
            dig(n-1);
        }
    }

