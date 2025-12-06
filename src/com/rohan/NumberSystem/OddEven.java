package com.rohan.NumberSystem;

public class OddEven {
    public static void main(String[] args) {
            int n = 67;
            if(!isOdd(n)){
                System.out.println(n + " is even");
            }else {
                System.out.println(n + " is Odd");
            }
    }

    static boolean isOdd(int n){
        /*
        A   B   A & B
        0   0     0
        0   1     0
        1   0     0                    LSB(least significant bit)
        1   1     1                     ^
        in binary 67 => 64 32 16 8 4 2  1
                   67 = 1  0  0  1 0 0 [1] (n)
                  & 1 = 0  0  0  0 0 0 [1] (1)
                      =>0  0  0  0 0 0 [1] (n & 1) == 1 (true) odd
                                           (67 & 1) == 1 (true)
        in binary 68 => 64 32 16 8 4 2  1
                   67 = 1  0  0  1 0 0 [0] (n)
                  & 1 = 0  0  0  0 0 0 [1] (1)
                      =>0  0  0  0 0 0 [0] (n & 1) == 1 (false) even
                                           (68 & 1) == 1 (false)
           AND(&) says any odd number(always contain 1 at the end) & 1 then we get 1
           AND(&) says any even number(don't contain 1 at the end) & 1 then we get 0
                         67 & 1 then we get 1
                         68 & 1 then we get 0
                         consider last number in 67 the last number is always 1 bcz its odd
                         consider last number in 68 the last number is always 0 bcz its even
                         if(1 & 1) we get 1 that's why == 1 (odd)
                         if(0 & 1) we get 0 that's why == 0 (even)
         */
        return (n & 1) == 1;
    }
}
