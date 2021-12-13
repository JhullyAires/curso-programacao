package com.company.PrimeirosPassos.EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class DescontoIfTernaria {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
/*
        double preco = scanner.nextDouble();   // ex: 34.5
        double desconto;

        if (preco < 20.0) {
            desconto = preco * 0.1;
        } else {
            desconto = preco * 0.05;
        }
*/
        double preco = scanner.nextDouble();
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.print(desconto);
        scanner.close();
    }
}
