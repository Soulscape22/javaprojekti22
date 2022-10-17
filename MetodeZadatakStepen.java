package com.itbootcamp.bgqa.nedelja3;

import java.util.Scanner;

public class MetodeZadatakStepen {

    public static void main(String[] args) {
        
        //sledeci zadatak: metoda stepen, koja prima dva argumenata, broj i stepen i racuna stepen broja. 
        // Dva edge case-a. Kad je stepen negativan i kad je stepen pozitivan. Prvo racunaj kad je pozitivan, lakse je (savet)

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost x: ");
        int x = s.nextInt();
        System.out.println("Unesite vrednost y: ");
        int y = s.nextInt();

        System.out.println(stepenBroja(x, y));

    }
    
    public static int stepenBroja (int x, int y) {

        int stepen = 1;
        for (int i = 0; i < y; i++) {
            stepen = stepen * y;
            x--;
        }
        return stepen;
    }
}
