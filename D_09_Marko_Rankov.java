package com.itbootcamp.bgqa.nedelja3;

public class D_09_Marko_Rankov {

    public static void main(String[] args) {

        //Napraviti metod koji ce za dva uneta Stringa proveriti da li su iste velicine, ako su iste velicine,


        System.out.println(poredjenjeReci("mama", "teta"));

        System.out.print(samoglasnici("teta", "mama"));
    }

    public static boolean poredjenjeReci (String prvaRec, String drugaRec) {

        boolean duzinaReci = true;

        for (int i = 0; i < prvaRec.length(); i++) {
            if (prvaRec.charAt(i) == drugaRec.charAt(i)) {
                duzinaReci = true;
            }else {
                duzinaReci = false;
            }
        }
        if (duzinaReci = true) {
            System.out.println("Ova dva stringa su jednaka");
        }
        return duzinaReci;
    }

    public static String samoglasnici (String prvaRec, String drugaRec) {

        String samoglasnik = "";

        for (int i = 0; i < prvaRec.length(); i++) {
            if (prvaRec.charAt(i) == 'a' || prvaRec.charAt(i) == 'e' || prvaRec.charAt(i) == 'i' ||
                    prvaRec.charAt(i) == 'o' || prvaRec.charAt(i) == 'u') {
                System.out.println(prvaRec.charAt(i));
            }
        }
        for (int i = 0; i < drugaRec.length(); i++) {
            if (drugaRec.charAt(i) == 'a' || drugaRec.charAt(i) == 'e' || drugaRec.charAt(i) == 'i' ||
                    drugaRec.charAt(i) == 'o' || drugaRec.charAt(i) == 'u') {
                System.out.println(drugaRec.charAt(i));
            }
        }

        return samoglasnik;
    }
    //git remote add upstream https://github.com/ORIGINAL_OWNER/ORIGINAL_REPOSITORY.git
    //git fetch upstream
    //git merge upstream/master
    //it init | git add "imefajla" | git commit -m "moja commit poruka" | git log | git checkout "commitId" | git checkout - (edited)
    //
    //
    //Марко Станковић
    //:dizzy:  8:23 PM
    //git checkout -b "nova grana" -> pravi novu granu pod imenom "nova grana"
    //git checkout "ime grane" -> vraca nas na tu granu
    //git branch -> lista svih grana
    //git merge "granaSaPromenama" -> spaja trenutnu granu na kojoj se nalazimo sa "granaSaPromenama"
    //8:25
    //git branch -d test1 -> brisanje grane "test1"

    //git remote set-url origin https://github.com/MyRepo/project.git
    //and then,
    //
    //git add .
    //git commit -m "initial commit"
    //git push origin master
}

