package com.itbootcamp.bgqa.nedelja3;

import java.util.Arrays;
import java.util.Scanner;

public class D_11_Marko_Rankov {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj imena: ");
        int k = s.nextInt();

        imena(k);
    }

    public static String[] imena (int k) {

        Scanner s = new Scanner(System.in);

        String[] imena = new String[k];
        for (int i = 0; i < imena.length; i++) {
            System.out.println("Unesite ime " + (i+1) + " u niz: ");
            String ime = s.nextLine();
            imena[i] = ime;
        }

        System.out.println("Ispis imena: " + Arrays.toString(imena));
        return imena;
    }
}
