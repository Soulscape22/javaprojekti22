package com.itbootcamp.bgqa.nedelja3;

import java.util.Scanner;

public class TrougaoCas {
    public static void main(String[] args) {

        /*for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < i; k += 2) {
                System.out.print("");
            }
            System.out.println(" ");
        }*/
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite visinu trougla: ");
        int visina = s.nextInt();

        //System.out.println();
        piramida(5);
        pravougaonaPiramida(7);
    }



    public static void piramida (int visina) {


        String z = "*";
        for(int i = 0; i < visina; i++) {
            for(int j = 0; j < visina - i - 1 ; j++) {
                System.out.print(" ");
            }
            System.out.println(z);
            z = z + "**";
        }
        }

    public static void pravougaonaPiramida (int visina) {

        String z ="*";
        for (int i = 0; i < visina; i++) {
            for (int j = 0; j < visina - i - 3; j++) {
                System.out.print("");
            }
            System.out.println(z);
            z = z + "**";
        }
    }


    }


   /* public static int[] ubaciElement (int[] niz, int element, int index) {

       /* Scanner s = new Scanner(System.in);
        int[] niz = new int[index];
        System.out.println("Unesite elemente niza: ");
        int element = s.nextInt();
    }
}
*/