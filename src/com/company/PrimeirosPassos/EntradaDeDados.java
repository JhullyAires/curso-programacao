package com.company.PrimeirosPassos;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {

        // para poder digitar ponto e na saída também vim o ponto
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int y;
        y = scanner.nextInt();
        System.out.println("Você digitou: " + y);

        // para poder digitar vírgula e na saída também vim a vírgula
        double w;
        w = scanner.nextDouble();
        System.out.printf("Você digitou: %.2f%n", w);
        // ou esse para digitar ponto
        double z;
        z = scanner.nextDouble();
        System.out.println("Você digitou: " + z);

        char a;
        a = scanner.next().charAt(0);
        System.out.println("Você digitou: " + a);

        String x;
        x = scanner.next();
        System.out.println("Você digitou: " + x);

        // para ler e separar o conteúdo de uma única linha


        String m;
        int n;
        double o;
        m = scanner.next(); // lê apenas uma palavra
        n = scanner.nextInt();
        o = scanner.nextDouble();
        System.out.println("Dados digitados: ");
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);

        // para ler um texto até a quebra de linha
    /*
        String s1, s2, s3;
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        s3 = scanner.nextLine();
        System.out.println("Dados digitados: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
     */

        // OBS: Quando você usa um comando
        // de leitura diferente do nextLine() e dá alguma
        // quebra de linha, essa quebra de linha fica
        // "pendente" na entrada padrão. Se você então
        // fizer um nextLine(), aquela quebra pendente será
        // absorvida pelo nextLine().

        //solução: faça um nextLine() extra antes de fazer seu
        // nextLine de seu interesse.

        String s1, s2, s3;
        int i;

        i = scanner.nextInt();
        scanner.nextLine();
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        s3 = scanner.nextLine();
        System.out.println("Dados digitados: ");
        System.out.println(i);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // para encerrar
        scanner.close();
    }
}
