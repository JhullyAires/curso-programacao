package com.company.PrimeirosPassos;

import java.util.Locale;
import java.util.Scanner;

public class Compras {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("DIGITE O CÓDIGO DO ITEM: ");
        int codigo = scanner.nextInt();

        if (codigo <= 5) {
            System.out.print("DIGITE A QUANTIDADE DO ITEM: ");
            int quantidade = scanner.nextInt();
            double total = 0;
            if (codigo == 1) {
                    total = quantidade * 4.00;
            }  else if (codigo == 2) {
                total = quantidade * 4.50;
            } else if (codigo == 3) {
                total = quantidade * 5.00;
            } else if (codigo == 4) {
                total = quantidade * 2.00;
            } else {
                total = quantidade * 1.50;
            }
            System.out.printf("TOTAL: R$ %.2f%n", total);
        } else {
            System.out.println("CÓDIGO INEXISTENTE! ");
        }


        scanner.close();
    }
}
