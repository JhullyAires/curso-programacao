package com.company.PrimeirosPassos.EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("INFORME UM NÚMERO: ");
        double a = scanner.nextDouble();

        System.out.print("INFORME UM NÚMERO: ");
        double b = scanner.nextDouble();

        System.out.print("INFORME UM NÚMERO: ");
        double c = scanner.nextDouble();

        double triangulo = a * c / 2.0;
        double circulo = 3.14159 * c * c;
        double trapezio = (a + b) / 2.0 * c;
        double quadrado = b * b;
        double retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        scanner.close();
    }
}
