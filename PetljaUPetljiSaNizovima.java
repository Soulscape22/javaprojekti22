package com.itbootcamp.bgqa.nedelja3;

import java.util.Arrays;

public class PetljaUPetljiSaNizovima {

        public static void main(String[] args) {

            int proizvod = 1;
            int[] niz1 = {1, 2, 3, 4, 5};
            int[] niz2 = {-1, -2, -3, -4, -5};

            for (int i = 0; i < niz1.length; i++) {
                System.out.println(niz1[i]);
                for (int j = 0; j < niz2.length; j++) {
                    System.out.print(niz2[j]);
                        proizvod = proizvod * niz2[j];
                }

                System.out.println();
            }
            System.out.println(proizvod);

        }
}
