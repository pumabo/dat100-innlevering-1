package javaoblig1;

import java.util.Scanner;

public class oppgo3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Verdi for n?: ");
        int n = input.nextInt();
        System.out.println("n er: " + n);


        if(n < 0) {
            System.out.println("Ugyldig tall");
        }    else {
                int fakultet = 1;
                for (int i = 1; i <= n; i++) {

                fakultet *= i;

            }

            System.out.println("Fakultetet av " + n + " er " + fakultet);

        }
    }

}
