package com.itbootcamp.bgqa.nedelja3;

import java.util.Arrays;
import java.util.Scanner;

public class D_12_Marko_Rankov {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj imena prvog niza: ");
        int n = s.nextInt();
        System.out.println("Unesite broj imena drugog niza: ");
        int m = s.nextInt();

    }

    public static String[] unija (int n, int m) {

        Scanner s = new Scanner(System.in);
        String[] imena1 = new String[n];
        String[] imena2 = new String[m];
        String[] imena3 = new String[6];
        int i = 0;
        for (i = 0; i < imena1.length; i++) {
            System.out.println("Unesite imena prvog niza: ");
            String name1 = s.nextLine();
            imena1[i] = name1;
        }
        for (int j = 0; j < imena2.length; j++) {
            System.out.println("Unesite imena drugog niza: ");
            String name2 = s.nextLine();
            imena2[j] = name2;
        }
        int l = 0;
        int k;
        for (k = 0, l=0; k < imena1.length; k++) {
            imena3[k].equalsIgnoreCase(imena1[k]);
                imena3[l].equalsIgnoreCase(imena2[k]);
                l++;
            }

            return imena1;
    }
}
