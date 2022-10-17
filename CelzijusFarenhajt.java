package com.itbootcamp.bgqa.nedelja3;

import java.util.Scanner;

public class CelzijusFarenhajt {
    public static void main(String[] args) {

        //DecimalFormat format = new DecimalFormat("#.000")


        Scanner s = new Scanner(System.in);
        System.out.println("Unesite temperaturu: ");
        double temperaturaUCelzijusu = s.nextDouble();

        System.out.println(temp(temperaturaUCelzijusu));
    }

    public static double temp (double temperaturaUCelzijusu){

        double temperaturaFarenhajt = temperaturaUCelzijusu * 1.8 + 32;
        System.out.println("Temeperatura u C: " + temperaturaUCelzijusu);
        System.out.println("Temperatura u F: " + temperaturaFarenhajt);
        return temperaturaFarenhajt;

    }
}
