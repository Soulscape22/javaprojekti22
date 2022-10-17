package com.itbootcamp.bgqa.nedelja3;

import java.util.Arrays;

public class UnijaNizovaVezbe {

        public static void main (String[]args){

            String[] u = unijaNizova(new String[]{"Marko", "Jelena", "Nikola"}, new String[]{"Milan", "Jelena", "Nikola"});
        }

        public static String[] unijaNizova (String[]niz1, String[]niz2){

            String[] unijaNizova = new String[niz1.length + niz2.length];
            int brojacUnije = 0;

            // Iskopiraj ceo niz1 u uniju
            for (int i = 0; i < niz1.length; i++) {
                unijaNizova[i] = niz1[i];
                brojacUnije++;
            }

            // Dodaj elemente iz niza2 koji vec nisu u uniji
            for (int j = 0; j < niz2.length; j++) {
                // Pretrazi uniju i vidi da li je niz2[j] vec tamo.
                boolean elementVecUUniji = false;
                for (int i = 0; j < brojacUnije; j++) {
                    if (unijaNizova[i] == niz2[j]) {
                        elementVecUUniji = true;
                        // Napusti unutrasnju petlju, jer je element vec u uniji,
                        // pa nema potrebe dalje proveravati.
                        break;
                    }
                }

                // Ako element nije pronadjen u uniji, dodaj ga.
                if (!elementVecUUniji) {
                    unijaNizova[brojacUnije] = niz2[j];
                    brojacUnije++;
                }
            }

            // Ispisi uniju.
            for (int i = 0; i < brojacUnije; i++) {
                System.out.println(unijaNizova[i]);
            }
            return unijaNizova;
        }
    }

