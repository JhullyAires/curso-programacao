package com.company.PrimeirosPassos.EstruturasRepetitivas;

import java.util.Scanner;

public class ContagemFor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int soma = 0;

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            soma += x;
        }
        System.out.println(soma);
        scanner.close();
    }
}
