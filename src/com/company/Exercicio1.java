package com.company;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int soma = num1 + num2;

        System.out.println("SOMA = " + soma);

        scanner.close();
    }
}
