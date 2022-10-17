package com.itbootcamp.bgqa.nedelja3;

public class MetodeZadatak1MarkoSApsolut {

    public static void main(String[] args) {

    }
    public static int apsolut(int broj) {
     /*
    if (broj < 0) { // da li je broj negativan
        return -broj; //sad je apsoluti broj pozitivan
    }
    return broj;
     */
    return (broj < 0) ?/*onda*/ -broj :/*inace*/ broj;
}

    public static double apsolut(double broj) {
        double apsolutniBroj = broj; //napravimo kopiju promenljive broj
        if (broj < 0) { // da li je broj negativan
            apsolutniBroj = broj * (-1); //sad je apsoluti broj pozitivan
        }
        return apsolutniBroj;
    }
}
