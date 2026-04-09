package com.rony.dsa.arrays.hmm;

public class Sum {
    public static void main(String[] args) {
        int n = 678;
        int sum = 0;

        while(n != 0) {
            int last = n % 10;


            sum += last;

            n/=10;
        }


        System.out.println(sum);

    }
}
