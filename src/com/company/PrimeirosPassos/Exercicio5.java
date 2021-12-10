package com.company.PrimeirosPassos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("INFORME O CÓDIGO DA PEÇA: ");
        int codigo1 = scanner.nextInt();

        System.out.print("INFORME O NÚMERO DE PEÇAS: ");
        int numPecas1 = scanner.nextInt();

        System.out.print("INFORME O VALOR UNITÁRIO DA PEÇA: ");
        double valorPeca1 = scanner.nextDouble();

        System.out.print("INFORME O CÓDIGO DA SEGUNDA PEÇA: ");
        int codigo2 = scanner.nextInt();

        System.out.print("INFORME O NÚMERO DE PEÇAS: ");
        int numPecas2 = scanner.nextInt();

        System.out.print("INFORME O VALOR UNITÁRIO DA PEÇA: ");
        double valorPeca2 = scanner.nextDouble();

        double valorPagar = (numPecas1 * valorPeca1) + (numPecas2 * valorPeca2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPagar);

        scanner.close();
    }
}
