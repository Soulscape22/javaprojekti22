package com.itbootcamp.bgqa.nedelja2;

import java.util.Scanner;

public class D_03_Marko_Rankov {

    public static void main(String[] args) {

            //Pomnoziti dva broja putem while petlje  tako da se obrati paznja na mnozenje negativnih brojeva.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        int prviBroj = scanner.nextInt();
        System.out.print("Unesite drugi broj: ");
        int drugiBroj = scanner.nextInt();

        int proizvod = 0;
        int cinioc = prviBroj;


        while (prviBroj > 0 || prviBroj < 0) {
            proizvod = proizvod + drugiBroj;
            prviBroj--;
        }
        System.out.println("Proizvod prvog broja " + cinioc+ " i drugog broja " + drugiBroj + " je " + proizvod);
    }
}
