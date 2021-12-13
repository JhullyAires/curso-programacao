package com.company.PrimeirosPassos.EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class DiasDaSemanaIf {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        String dia = null;

        if (x == 1) {
            dia = "domingo";
        } else if (x == 2) {
            dia = "segunda";
        } else if (x == 3) {
            dia = "terça";
        } else if (x == 4) {
            dia = "quarta";
        } else if (x == 5) {
            dia = "quinta";
        } else if (x == 6) {
            dia = "sexta";
        } else if (x == 7) {
            dia = "sábado";
        } else {
            System.out.println("VALOR INVÁLIDO");
        }

        System.out.println("DIA DA SEMANA: " + dia);

        scanner.close();
    }
}
