package com.company.PrimeirosPassos;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE TRÊS NÚMEROS: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int diferenca = a * b - c * d;

        System.out.println("DIFERENÇA = " + diferenca);

        scanner.close();
    }
}
