package com.itbootcamp.bgqa.nedelja3;

public class MetodeStepen {

    public static void main(String[] args) {

        System.out.println(stepen(2,-3));
        //System.out.println(random(100, 1));
        //System.out.println(random2(1,100));
    }

    public static double stepen (double n, int eksp) {

        double rezultat = 1;

        for (int i = 0; i < Math.abs(eksp); i++) {
            rezultat = rezultat * n;
        }
        if (eksp < 0) {
            rezultat = 1/ rezultat;
        }
        return rezultat;
    }

    public static double random (int gornjaVrednost, int donjaVrednost) {

        //35. implementirati funkciju random koja vraca nasumican broj u rasponu od m do n gde su m i n parametri metode

        double nasumicniBroj = (int)Math.random() * (gornjaVrednost - donjaVrednost + 1) + donjaVrednost;

        return nasumicniBroj;
    }

    public static double random2 (int m, int n) {

        double nasumicniBroj= Math.min(m,n)+Math.random()*Math.max(m,n);
        return nasumicniBroj;
    }
}
