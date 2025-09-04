package javaoblig1;

import java.util.Scanner;

public class oppgo2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("En eller flere karakterer?: ");
        String karakterer = input.nextLine();
        if(karakterer.toLowerCase() == "en") {


            System.out.println("Poengsum?: ");
            int poeng = input.nextInt();

            System.out.println("Du har: " + poeng + "poeng");

            if (0 <= poeng && poeng <= 39) {
                System.out.println("Du fikk F, hahaha du strøk");
            }
            if (49 >= poeng && poeng >= 40) {

                System.out.println("Du fikk: E");
            }
            if (59 >= poeng && poeng >= 50) {

                System.out.println("Du fikk: D");
            }
            if (79 >= poeng && poeng >= 60) {

                System.out.println("Du fikk: C");
            }
            if (89 >= poeng && poeng >= 80) {

                System.out.println("Du fikk: B");
            }
            if (100 >= poeng && poeng >= 90) {

                System.out.println("Du fikk: A");
            }
            if (100 < poeng) {

                System.out.println("Ugyldig poengsum.");
            }
            if (poeng < 0) {

                System.out.println("Ugyldig poengsum.");
            }
        }
        if(karakterer.toLowerCase() == "flere");

        int i = 0;
            while(i < 10)
        {   System.out.println("Person nr: " + (i + 1) + " poengsum?: ");


            int poeng = input.nextInt();

            System.out.println("Du har: " + poeng + "poeng");

            if (0 <= poeng && poeng <= 39) {
                System.out.println("Du fikk F, hahaha du strøk");
                i++;
            }
            if (49 >= poeng && poeng >= 40) {

                System.out.println("Du fikk: E");
                i++;
            }
            if (59 >= poeng && poeng >= 50) {

                System.out.println("Du fikk: D");
                i++;
            }
            if (79 >= poeng && poeng >= 60) {

                System.out.println("Du fikk: C");
                i++;
            }
            if (89 >= poeng && poeng >= 80) {

                System.out.println("Du fikk: B");
                i++;
            }
            if (100 >= poeng && poeng >= 90) {

                System.out.println("Du fikk: A");
                i++;
            }

            if (100 < poeng) {

                System.out.println("Ugyldig poengsum, skriv inn på nytt.");
            }
            if (poeng < 0) {

                System.out.println("Ugyldig poengsum, skriv inn på nytt.");

            }
        }
    }
}

