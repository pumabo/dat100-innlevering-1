package javaoblig1;

import java.util.Scanner;

public class oppgo1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inntekt?: ");
        double inntekt = scanner.nextDouble();

        System.out.println("Din inntekt er: " + inntekt + "kr");

        if (inntekt <= 217400) {
            System.out.println("Du betaler ingen trinnskatt.");
        }
        if (306050 >= inntekt && inntekt > 217400) {

            System.out.println("Du betaler: " + inntekt * 0.017 + "kr i trinnskatt");
        }
        if (306050 < inntekt && inntekt <= 697150) {

            System.out.println("Du betaler: " + inntekt * 0.04 + "kr i trinnskatt");
        }
        if (697151 <= inntekt && inntekt <= 942400) {

            System.out.println("Du betaler: " + inntekt * 0.137 + "kr i trinnskatt");
        }
        if (942401 <= inntekt && inntekt <= 1410750) {

            System.out.println("Du betaler: " + inntekt * 0.167 + "kr i trinnskatt");
        }
        if (inntekt > 1410750) {

            System.out.println("Du betaler: " + inntekt * 0.177 + "kr i trinnskatt");
        }
    }
}
