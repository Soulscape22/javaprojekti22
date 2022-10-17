package com.itbootcamp.bgqa.nedelja3;

public class MetodePalindromeJedanBrojac {
    public static void main(String[] args) {

        System.out.println(palindrome("abccba"));

    }

    public static boolean palindrome (String rec) {

        boolean jePalindrom = true;
        for (int i = 0, j = rec.length()-1; i < rec.length(); i++, j--) {
            if (rec.charAt(i) == rec.charAt(j)) {
                jePalindrom = true;
            } else {
                jePalindrom = false;
            }
        }

        return jePalindrom;

    }
}

