package com.company.PrimeirosPassos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("DIGITE UM NÚMERO: ");
        int num = scanner.nextInt();

        System.out.print("DIGITE HORAS TRABALHADAS NO MÊS: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("DIGITE VALOR POR HORA: ");
        double valorPorHora = scanner.nextDouble();

        double salario = valorPorHora * horasTrabalhadas;

        System.out.println("SEU NÚMERO É: " + num);
        System.out.printf("SEU SALÁRIO É: R$ %.2f%n", salario);

        scanner.close();
    }
}
