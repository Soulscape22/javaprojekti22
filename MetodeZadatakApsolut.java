package com.itbootcamp.bgqa.nedelja3;

import java.util.Scanner;

public class MetodeZadatakApsolut {
    public static void main(String[] args) {

        //implementiraj metodu koja za uneti ceo broj vraca apsolutnu vrednost tog broja 2 ->2 , -2 -> 2...
        // i implementirti metodu koja prima dobule i vraca apsolutnu vrednost tog broja.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost: ");
        int x = s.nextInt();


        System.out.println(apsolut(-5));

    }

    public static int apsolut(int broj) {

        int apsolutniBroj = broj; //napravimo kpiju promenljive
        if (broj < 0) // da li je broj negativan
        {
            apsolutniBroj = -broj; // broj je pozitivan
        }
        return apsolutniBroj;

        /*if (broj > 0) {
            return -broj;
        }
        return broj;*/

        //return (broj > 0) ?/*onda*/-broj : /*inače*/broj;
    }

        public static double apsVrednost (double broj) {

            double apsolutniBroj = broj; //napravimo kpiju promenljive
            if (broj > 0) // da li je broj negativan
            {
                apsolutniBroj = -broj; // broj je pozitivan
            }
            return apsolutniBroj;
        }

}
