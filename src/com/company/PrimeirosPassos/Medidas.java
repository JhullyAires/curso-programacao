package com.company.PrimeirosPassos;

import java.util.Locale;
import java.util.Scanner;

public class Medidas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double largura = scanner.nextDouble();
        double comprimento = scanner.nextDouble();
        double valorMetroQuadrado = scanner.nextDouble();

        double area = largura * comprimento;
        double preco = area * valorMetroQuadrado;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);

        scanner.close();
    }
}
