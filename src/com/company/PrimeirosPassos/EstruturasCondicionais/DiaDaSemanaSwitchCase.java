package com.company.PrimeirosPassos.EstruturasCondicionais;

import java.util.Scanner;

public class DiaDaSemanaSwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        String dia = switch (x) {
            case 1 -> "domingo";
            case 2 -> "segunda";
            case 3 -> "terça";
            case 4 -> "quarta";
            case 5 -> "quinta";
            case 6 -> "sexta";
            case 7 -> "sábado";
            default -> "valor inválido";
        };

        System.out.println("Dia da semana: " + dia);
        scanner.close();
    }
}
