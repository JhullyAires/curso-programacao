package com.company.PrimeirosPassos.EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class CalculoCumulativa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("DIGITE QUANTOS MINUTOS USOU: ");
        int minutos = scanner.nextInt();

        double conta = 50.0;
        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("O VALOR DA CONTA SERÁ: R$  %.2f%n", conta);

        scanner.close();
    }
}
