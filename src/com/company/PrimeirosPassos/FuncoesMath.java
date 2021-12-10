package com.company.PrimeirosPassos;

import java.util.Locale;
import java.util.Scanner;

public class FuncoesMath {
    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    double x = 3.0;
    double y = 4.0;
    double z = -5.0;
    double A, B, C;

    A = Math.sqrt(x); // variável A recebe a raiz quadrada de x
    B = Math.sqrt(y); // variável B recebe a raiz quadrada de y
    C = Math.sqrt(25.0); // variável C recebe a raiz quadrada de z
    System.out.println("Raiz quadrada de " + x + " = " + A);
    System.out.println("Raiz quadrada de " + y + " = " + B);
    System.out.println("Raiz quadrada de 25 = " + C);

    A = Math.pow(x, y); // variável A recebe o resultado de x elevado a y
    B = Math.pow(x, 2.0); // variável B recebe o resultado de x elevado a 2.0
    C = Math.pow(5.0, 2.0); // variável C recebe o resultado de 5.0 elevado a 2.0
    System.out.println(x + " elevado a " + y + " = " + A);
    System.out.println(x + " elevado ao quadrado = " + B);
    System.out.println("5 elevado ao quadrado =  " + C);

    A = Math.abs(y); // variável A recebe o valor absoluto de y
    B = Math.abs(z); // variável B recebe o valor absoluto de z
    System.out.println("Valor absoluto de " + y + " = " + A);
    System.out.println("Valor absoluto de " + z + " = " + B);

    // fórmula de báskara
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    double delta, x1, x2;

    delta = Math.pow(b, 2.0) - 4 * a * c;

    x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
    x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

    System.out.println("O resultado é = " + x1 + "," + x2);
    }
}
