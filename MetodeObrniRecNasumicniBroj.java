package com.itbootcamp.bgqa.nedelja3;

public class MetodeObrniRecNasumicniBroj {
    public static void main(String[] args) {

        //. zadatak. Implementirati funkciju random koja vraca nasumican broj u rasponu od m do n gde su m i n parametri metode.
        // Npr. random(1, 10) -> nasumican broj od 1 do 10.
        // Koristiti Math.random za generisanje vrednosti.

        /*Scanner s = new Scanner(System.in);
        System.out.println("Unesite trazeni broj: ");
        int brojKorisnika = s.nextInt();

        nasumicni(2, 10);*/
       /* Scanner s = new Scanner(System.in);
        System.out.println("Unesi rec cao: ");
        String x = s.nextLine();*/

        //System.out.println(rec(x));
        //System.out.println(nasumicni(0, 10));

        /*
        System.out.println(args[0]);
        System.out.println(args[1]);

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);*/

        System.out.println(rec("cao"));
        }


    public static int nasumicni(int donjaGranica, int gornjaGranica) {

        return (int) Math.random() * (gornjaGranica - donjaGranica + 1) + donjaGranica;

        //drugačiji način
        //    double nasumicniBroj= Math.min(m,n)+Math.random()*Math.max(m,n);
        //  return nasumicniBroj;
        //    }
        //    }


    }

    public static String rec(String x) {


        String obrnutaRec = "";

        for (int i = x.length() - 1; i >= 0; i--) {
            obrnutaRec = obrnutaRec + x.charAt(i);
        }
        return obrnutaRec;
    }
    }

      /*  String obrniRec = x;

        for (int i = obrniRec.length() - 1; i >= 0; i--) {
            System.out.print(obrniRec.charAt(i) + " ");
        }
        return obrniRec;*/


        //
        //    //petlja obrnutaRec = obrnutaRec + "charAt(index)"
        //
        //    return obrninutaRec;



    //public static boolean palindrom ()
