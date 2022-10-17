package com.itbootcamp.bgqa.nedelja3;

import java.util.Scanner;

public class MetodePalindrome {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("unesi rec: ");
        String x = s.nextLine();

        System.out.println(palindrome(x));
    }

      public static boolean palindrome (String x){

        boolean jePalindrom = true;

            String unazad = x;

        for (int i = unazad.length() - 1, j = 0; i > 0; i--) {
                if (unazad.charAt(i) == unazad.charAt(j)) {
                    jePalindrom = true;
                }
                else {
                    jePalindrom = false;
                }
                    j++;
                    break;
                }
          return jePalindrom;
        }


}
