package com.company.PrimeirosPassos.POO.NotPOO;

import java.util.Locale;
import java.util.Scanner;

public class ExampleVectors1 {
    public static void main(String[] args) {

        // Fazer um programar para ler um número inteiro N
        // e a altura de N pessoas. Armazene as N alturas em
        // um vetor. Em seguida, mostrar a altura média dessas
        // pessoas.

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            vect[i] = scanner.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        double avg = sum / n;

        System.out.printf("AVAREGE HEIGHT: %.2f%n", avg);

        scanner.close();
    }
}
