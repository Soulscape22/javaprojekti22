package com.itbootcamp.bgqa.nedelja3;

import java.util.Scanner;

public class MetodeObrniRec {
    public static void main(String[] args) {

        //Napraviti metodu koja obrce zadati String. obrni("cao") -> "oac"

        System.out.println(obrniRec("cao"));
        obrniRec("cao");

        int[] u = obrniNiz(new int[]{1, 2, 3, 4, 5});
    }

    public static String obrniRec (String x) {

        String obrnutaRec = x;

        for (int i = obrnutaRec.length() - 1; i > 0; i--) {
            obrnutaRec = obrnutaRec + x.charAt(i);
        }
        return obrnutaRec;
    }

    public static int[] obrniNiz (int[] niz) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite elemente niza: ");
        int element = s.nextInt();

        int[] obrnutiNiz = new int[niz.length];
        for (int i = obrnutiNiz.length - 1;i > 0;i--) {
            obrnutiNiz[i] = obrnutiNiz[i] + element;
        }
        return obrnutiNiz;
    }
}
