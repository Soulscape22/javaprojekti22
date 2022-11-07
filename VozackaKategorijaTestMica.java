package com.itbootcamp.bgqa.nedelja3;

public class VozackaKategorijaTestMica {

    public static void main(String[] args) {

        System.out.println(vozackaKategorija("a"));
        System.out.println(vozackaKategorija("A"));
        System.out.println(vozackaKategorija("e"));

    }

    public static String vozackaKategorija(String kategorija) {


        if (kategorija == "A") {
            return "motor";
        }
        if (kategorija == "a") {
            return "motor";
        }
        if (kategorija == "b") {
            return "automobil";
        }
        if (kategorija == "c") {
            return "kamion";
        }
        if (kategorija == "d") {
            return "autobus";
        }
        if (kategorija == "e") {
            return "kamion sa prikolicom";
        }

        return "Nepoznato vozilo";
    }
}
