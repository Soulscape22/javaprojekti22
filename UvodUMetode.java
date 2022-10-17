package com.itbootcamp.bgqa.nedelja3;

import java.util.Scanner;

public class UvodUMetode {
    public static void main(String[] args) {

        //System.out.println(proizvod(5, 5));
        //System.out.println("Pocetak programa...");
        /*
        int x = 5;
        int y = 5;
        int proizvod = x * y;
        System.out.println(proizvod);

        int x2 = 10;
        int y2 = 10;
        int proizvod2 = x2 * y2;
        System.out.println(proizvod2);

         */
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite prvi broj ");
        int prviBroj = s.nextInt();
        System.out.println("Unesite drugi broj ");
        int drugiBroj = s.nextInt();

        int rezultat1 = proizvod(prviBroj, drugiBroj);  // 6
        /*int rezultat2 = proizvod(3, 4);  // 12
        int rezultat3 =  proizvod(rezultat1, rezultat2);

        System.out.println(rezultat2);*/
        System.out.println(rezultat1);
        /*System.out.println(rezultat3);
        System.out.println(proizvod(5, 5));
        System.out.println("Kraj programa");*/

    }
    public static int/*povratni tip metode/return type*/ proizvod(int x, int y) {
        //apstrakcija, mogucnost ponovnog koriscenja bloka koda - reusability, mogucnost lakog otklanjanja bagova
        //metoda pravi kopije argumenata i cuva ih u promeljive x i y
        // x i y se nazivaju lokalne promenljive posto su lokalne za ovu metodu
        int proizvod = x * y;
        return proizvod; //vraca vrednost promeljive 'proizvod'
        //System.out.println(proizvod);
    }
}
