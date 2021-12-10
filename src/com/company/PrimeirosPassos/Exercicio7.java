package com.company.PrimeirosPassos;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horaInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();

        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou " + duracao + " hora(s)");

        scanner.close();
    }
}
