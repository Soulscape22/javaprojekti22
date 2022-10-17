package com.itbootcamp.bgqa.nedelja3;

import java.util.Scanner;

public class xxxtrougao {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite visinu trougla: ");
        int visina = s.nextInt();

        for (int i = 0; i < visina; i++) {
            for (int j = visina; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
