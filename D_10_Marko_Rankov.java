package com.itbootcamp.bgqa.nedelja3;

public class D_10_Marko_Rankov {

    public static void main(String[] args) {

        int broj = 5;
        int fakt = 1;

        for (int i = 1; i <= broj; i++) {
            fakt = fakt * i;
        }
        System.out.println("Faktorijal broja " + broj + " je " + fakt);
    }
}
