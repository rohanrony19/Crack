package com.rony.dsa.arrays.hmm;

import java.util.Scanner;

public class HappySadSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter initial number of people");
        double happy = sc.nextDouble();
        double sad = 0;

        for (int i = 1; i <= 4; i++) {
            double newHappy = 0.3*happy + 0.5*sad;
            double newSad = 0.7*happy + 0.5*sad;

            happy = newHappy;
            sad = newSad;

            System.out.println("After iteration " + i + ":");
            System.out.println("Happy = " + happy);
            System.out.println("Sad = " + sad);
            System.out.println("-------------------");
        }
        sc.close();
    }
}
