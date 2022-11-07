package com.itbootcamp.bgqa.nedelja3;

import java.util.Arrays;
import java.util.Scanner;

public class Marko_Rankov_Java_Projekat {


    public static int[] elementiInt (int n) {

        Scanner s = new Scanner(System.in);

        int[] niz = new int[n];
        for (int i = 0; i < niz.length; i++) {
            System.out.println("Unesite broj " + (i+1) + " elementa u niz: ");
            int broj = s.nextInt();
            niz[i] = broj;
        }
        System.out.println("Ispis elemenata niza: " + Arrays.toString(niz));
        return niz;
    }

    public static String[] elementiString (int m) {

        Scanner s = new Scanner(System.in);

        String[] niz = new String[m];
        for (int i = 0; i < niz.length; i++) {
            System.out.println("Unesite string " + (i+1) + " elementa u niz: ");
            String rec = s.nextLine();
            niz[i] = rec;
        }
        System.out.println("Ispis elemenata niza: " + Arrays.toString(niz));
        return niz;
    }

    public static char[] elementiChar (int c) {


        char[] niz = new char[c];
        int duzinaNiza = 0;
        String unos = "";
        Scanner s = new Scanner(System.in);

        while (duzinaNiza < c) {
            System.out.println("Unesite karakter niza: ");
            unos = s.nextLine();
            if (unos == "") break;
            niz[duzinaNiza] = unos.charAt(0);
            duzinaNiza++;
        }

        return niz;
    }

    public static int zbirCifara (int n) {

        //Implementirati metodu int zbirCifara(int n) koja sabira cifre sve dok rezultat ne bude samo jedna cifra.
        //Npr. 1234 -> 1, 43 -> 7, 55 -> 1, 556 -> 7

        int suma = 0;
        String broj = Integer.toString(n);
        while (broj.length() > 1) {
            suma = 0;
            for (int i = 0; i < broj.length(); i++) {
                suma += Integer.parseInt(String.valueOf(broj.charAt(i)));
            }
            broj = Integer.toString(suma);

        }
        return suma;
    }

    public static boolean stepenBroja (int broj, int rezultat) {

        //2. Implementirati metodu boolean rezultat(int n, int m) koja vraća true ukoliko je n stepen broja m.
        //Npr: (9, 3) -> true, (125, 5) -> true, (13, 4) -> false

        int proizvod = 1;
        boolean tacnostStepena = true;
        while (proizvod < rezultat)
         {
            proizvod = proizvod * broj;
            if (proizvod == rezultat){
                tacnostStepena = true;
                break;
            } else if (proizvod > rezultat) {
                tacnostStepena = false;
            }
        }

        return tacnostStepena;



    }

    public static int[] zbirIndexaNizaMeta (int[] niz, int meta) {

        //3. Implementirati metodu int[] zbirIndexaNizaMeta(int[] niz, int meta)
        // koja vraća indekse dva elementa koji kada se saberu daju rezultat koji je jednak meti.
        //Npr. ({2, 3, 10, -2}, 5) -> {0, 1}


        int[] drugiNiz = new int[5];
        int suma = 0;
        int brojacDrugogNiza = 0;
        for (int i = 0; i < niz.length; i++) {
            for (int j = 0; j < niz.length; j++) {
                suma = niz[i] + niz[j];
                if (suma == meta) {
                    drugiNiz[brojacDrugogNiza++] = i;
                    drugiNiz[brojacDrugogNiza++] = j;
                    break;
                }
            }
            if (brojacDrugogNiza >= 2){
                break;
            }
        }

        int[] nizTrimovani = new int[brojacDrugogNiza];
        for (int i = 0; i < brojacDrugogNiza; i++) {
            nizTrimovani[i] = drugiNiz[i];
        }
        System.out.println(Arrays.toString(nizTrimovani));

            return nizTrimovani;
    }

    public static String toBinary (int n) {

        //4. Implementirati metodu String toBinary(int n) koja vraća broj n u binarnom formatu. Uzeti apsolutnu vredost n.
        //Npr. 10 -> 1010, 100 -> 1100100

        /*String binaryString = Integer.toBinaryString(Math.abs(n));
        return binaryString;*/

        String ostatak1 = "0";
        String ostatak2 = "1";
        String[] niz = new String[10];
        String[] noviNiz = new String[niz.length];
        StringBuilder bilder = new StringBuilder();
        int i = 0;
        int k =0;

        while (Math.abs(n) > 0) {
            if (n % 2 == 0){
                niz[i] = ostatak1;
            }
            if (n % 2 != 0) {
                niz[i] = ostatak2;
            }
            n = n * 1/2;
            i++;
        }
        for (int j = 0; j < niz.length; j++) {
            if (niz[j] == null){
                continue;
            }else {
                noviNiz[j] = niz[j];
                k++;
            }
        }
        String[] trimovaniNiz = new String[k];
        for (int j = 0; j < k; j++) {
            int o = trimovaniNiz.length - 1 - j;
            trimovaniNiz[o] = noviNiz[j];
        }

        for (int j = 0; j < trimovaniNiz.length; j++) {
            bilder.append(trimovaniNiz[j] + " ");
        }
        String bilderString = bilder.toString();


        return bilderString;
    }
    
    public static int brojPonavljanja (String s, String recenica) {

        // 5. Implementirati metodu int brojPonavljanja(String s, String recenica) koja vraća broj ponavljanja stringa "s" u rečenici.
        // Hint: istražiti s.split("") metodu.
        //Npr. ("cao", "cao kako si cao") -> 2
        int suma = 0;


        String[] izdeljenaRecenica = recenica.split(" ",7);

        for (int i = 0; i < izdeljenaRecenica.length; i++) {
            if (izdeljenaRecenica[i].equalsIgnoreCase(s)){
                suma ++;
            }
        }

        return suma;
    }

    public static int[] pomeriNule (int[] niz) {

        //6. Implementirati metodu int[] pomeriNule(int[] niz) koja vraća niz u kome su sve nule pomerene na kraj niza.
        //Npr. {1, 0, 0, 2, 3} -> {1, 2, 3, 0, 0}

        int[] noviNiz = new int[niz.length];
        int brojacDrugogNiza = 0;

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] == 0) {
                continue;
            } else if (niz[i] != 0) {
                noviNiz[brojacDrugogNiza] = niz[i];
                brojacDrugogNiza++;
            }
        }
        return noviNiz;
    }

    public static int[] izbaciDuplikate (int[] niz) {

        //7. Implementirati metodu int[] izbaciDuplikate(int[] niz) koja vraća niz bez duplikata.
        //Npr. {1, 2, 3, 3} -> {1, 2, 3}, {3, 4, 3, 4, 3, 4, 5} -> {3, 4, 5}

        int[] noviNiz = new int[niz.length];

        int brojacNiza = 0;

        for (int i = 0; i < niz.length; i++) {
            boolean imaDuplikat = false;
            for (int j = i+1; j < niz.length; j++) {
                if (i == j) continue;
                if (niz[i] == niz[j]) {
                    imaDuplikat = true;
                    break;
                }
            }
                if (!imaDuplikat) {
                    noviNiz[brojacNiza] = niz[i];
                    brojacNiza++;
                }
            }

        return Arrays.copyOf(noviNiz, 5);
    }


    public static void main (String[] args) {

        //elementiInt(5);
        //elementiString(5);
        //System.out.println(Arrays.toString(elementiChar(5)));
         //System.out.println(Arrays.toString(elementiChar(5)));
        //System.out.println(zbirCifara(123));
        //System.out.println(stepenBroja(4, 256));
        //zbirIndexaNizaMeta(new int[]{10, 25, 35, 45, 60}, 105);
        //System.out.println(toBinary(-100));
        //System.out.println(brojPonavljanja("cao", "Cao kako si? Cao dobro sam, cao"));
        //System.out.println(Arrays.toString(pomeriNule(new int[]{5, 2, 0, 6, 10, 0, 3})));
        //System.out.println(Arrays.toString(izbaciDuplikate(new int[]{1, 2, 2, 3, 4, 4, 5})));


    }
}
