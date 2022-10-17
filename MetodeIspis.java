package com.itbootcamp.bgqa.nedelja3;

public class MetodeIspis {
    public static void main(String[] args) {
        ispis("cao");
        ispis();

    }

    public static void ispis (String rec) {

        System.out.println("ulazimo u metodu ispis: ");
        System.out.println(rec);
    }

    public static String ispis () {

        System.out.println("Cao iz metode ispis");
        return "Vraceno iz metode ispis";
    }
}
