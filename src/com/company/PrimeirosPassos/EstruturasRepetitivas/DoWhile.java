package com.company.PrimeirosPassos.EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

            // FORMA COM APENAS O WHILE
        char resposta = 's'; // jeitinho de fazer começar

        while (resposta != 'n') {
            System.out.print("Insira a temperatura em Celsius: ");
            double c = scanner.nextDouble();
            double f = 9.0 * c / 5.0 + 32.0;

            System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
            System.out.print("Deseja repetir (s/n)? ");
            resposta = scanner.next().charAt(0);
        }

                // FORMA COM DO-WHILE  (melhor forma)
        char resposta;
        do {
            System.out.print("Insira a temperatura em Celsius: ");
            double c = scanner.nextDouble();
            double f = 9.0 * c / 5.0 + 32.0;

            System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
            System.out.print("Deseja repetir (s/n)? ");
            resposta = scanner.next().charAt(0);
        } while (resposta != 'n');

        scanner.close();
    }
}
