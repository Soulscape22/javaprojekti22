package com.itbootcamp.bgqa.nedelja3;

import java.util.Arrays;
import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");;
        int duzinaNiza = s.nextInt();
        ime(duzinaNiza);

        System.out.println("Unesite broj:");
        int x = s.nextInt();
        System.out.println("Unesite broj stepena: ");
        int y = s.nextInt();

        System.out.println(stepen(5, 5));

        String[] u = unijaNizova(new String[]{"Marko", "Marija", "Nikola"}, new String[]{"Milan", "Marija", "Nikola"});
    }
    public static String[] ime (int duzinaNiza) {

        Scanner s = new Scanner(System.in);
        String[] niz = new String[duzinaNiza];
        int i;

        for (i = 0; i < niz.length; i++) {
            System.out.println("Unesite ime " + (i+1) + " elementa u niz: ");
            String ime = s.nextLine();
            niz[i] = ime;
            }

        System.out.println(Arrays.toString(niz));
        return niz;
        }

    public static int stepen (int x, int y) {

            int stepen = 1;
            for (int i = 0; i < y; i++) {
                stepen = stepen * y;
                x--;
            }

            return stepen;
        }

    public static String[] unijaNizova (String[] niz1, String[] niz2) {

        String[] unijaNizova = new String[niz1.length + niz2.length];

        //Iskopiraj ceo niz1 u uniju
        // Dodaj elemente iz niza2 koji vec nisu u uniji
        // Pretrazi uniju i vidi da li je niz2[j] vec tamo.

        // Napusti unutrasnju petlju, jer je element vec u uniji,
        // pa nema potrebe dalje proveravati.

        // Ako element nije pronadjen u uniji, dodaj ga.

        // Ispisi uniju.

        int brojacUnije = 0;
        for (int i = 0; i < niz1.length; i++) {
            unijaNizova[i] = niz1[i];
            brojacUnije++;
        }

        for (int j = 0; j < niz2.length; j++) {
            boolean elementVecUUniji = false;
            for (int i = 0; i < brojacUnije; i++) {
                if (unijaNizova[i] == niz2[j]) {
                    elementVecUUniji = true;
                    break;
                }
            }
            if (!elementVecUUniji) {
                unijaNizova[brojacUnije] = niz2[j];
                brojacUnije++;
            }

        }
        for (int i = 0; i < brojacUnije; i++) {
            System.out.println(unijaNizova[i]);
        }
        return unijaNizova;
    }

        }


