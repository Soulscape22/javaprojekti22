package com.itbootcamp.bgqa.nedelja3;

public class PetljaUPetljiZadatakProizvodi {

    public static void main(String[] args) {

        //Zadatka: 3: napraviti proizvod svih brojeva iz prvog i drugog niza.

        int proizvod = 0;

        int[] niz1 = {1, 2, 3, 4, 5};
        int[] niz2 = {-1, -2, -3, -4, -5};

        for (int i = 0; i < 1; i++) {
            System.out.println(niz1[i]);
            for (int j = 0; j < niz2.length; j++) {
                if (niz1[i] >= 0){
                    System.out.print(niz2[j]);
                    proizvod += niz2[j];
                    niz1[i]--;
                }

            }
            System.out.println(proizvod);
        }
    }
}
