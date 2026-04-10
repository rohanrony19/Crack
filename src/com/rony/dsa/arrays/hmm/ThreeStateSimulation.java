package com.rony.dsa.arrays.hmm;

import java.util.Scanner;

public class ThreeStateSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Initial Happy");
        double happy = sc.nextDouble();
        double neutral = 0;
        double sad = 0;

        for (int i = 1; i <= 3; i++) {
            double newHappy = (0.5*happy)+(0.2*neutral)+(0.1*sad);
            double newNeutral = (0.3*happy) + (0.5*neutral) + (0.4*sad);
            double newSad = (0.2*happy) + (0.3*neutral)+(0.5*sad);

            happy = newHappy;
            neutral = newNeutral;
            sad = newSad;
        }

        System.out.printf("%.2f",happy);
        System.out.println();
        System.out.printf("%.2f",neutral);
        System.out.println();
        System.out.printf("%.2f",sad);

        sc.close();
    }
}
