package com.company.PrimeirosPassos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE O RAIO DO CIRCULO: ");
        double raio = scanner.nextDouble();
        double area = 3.141559 * (Math.pow(raio, 2.0));

        System.out.printf("AREA = %.4f%n", area);

        scanner.close();
    }
}
