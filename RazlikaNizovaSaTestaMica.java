package com.itbootcamp.bgqa.nedelja3;

import java.util.Arrays;

public class RazlikaNizovaSaTestaMica {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(razlikaNizova(new int[]{1, 2, 3}, new int[]{2, 3, 4})));
    }

    public static int[] razlikaNizova(int[] a, int[] b) {

        int[] razlikaNizova = new int[a.length + b.length];
        int razlikaBrojac = 0;
        for (int i = 0; i < a.length; i++) {
            boolean uNizu = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[i]) {
                    uNizu = true;
                }
                if (uNizu == false) {
                    razlikaNizova[razlikaBrojac] = a[i];
                    razlikaBrojac++;
                }

            }
            if (uNizu == false) {
                razlikaNizova[razlikaBrojac] = a[i];
                razlikaBrojac++;
            }

        }
        return razlikaNizova;
    }
}