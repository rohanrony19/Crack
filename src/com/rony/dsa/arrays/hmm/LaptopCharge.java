package com.rony.dsa.arrays.hmm;

import java.util.Scanner;

public class LaptopCharge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter min required charge");
        int n = sc.nextInt();

        System.out.println("Enter num of laptops");
        int size = sc.nextInt();

        int[] charges = new int[size];

        System.out.println("Enter laptop charges");
        for (int i = 0; i < size; i++) {
            charges[i] = sc.nextInt();
        }

        int count = 0;

        for(int charge:charges){
            if(charge >= n){
                count++;
            }
        }

        System.out.println(count);
    }
}
