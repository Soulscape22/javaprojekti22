package com.itbootcamp.bgqa.nedelja3;

import java.sql.SQLOutput;

public class MetodeFizzBuzz {
    public static void main(String[] args) {

        fizzBuzz(1, 10);

    }


    public static void fizzBuzz(int donjaGranica, int gornjaGranica) {



        for (int i = donjaGranica; i <= gornjaGranica ; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else if (i % 3 == 0){
                System.out.println("Fizz");
            }else {
                System.out.println(i);
            }

        }

    }
}
