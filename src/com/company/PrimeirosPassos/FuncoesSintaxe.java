package com.company.PrimeirosPassos;

import java.util.Scanner;

public class FuncoesSintaxe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        /*
        if (a > b && a > c) {
            System.out.println("Higher: " + a);
        } else if (b > c) {
            System.out.println("Higher: " + b);
        } else {
            System.out.println("Higher: " + c);
        }
        */

        // FUNÇÃO ENXUTA
        int higher = max(a, b, c);

        showResult(higher);

        scanner.close();
    }
    // PARA CRIAR UMA FUNÇÃO
    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    // PARA CRIAR UMA FUNÇÃO VAZIA
    public  static void showResult(int value) {
        System.out.println("Higher = " + value);
    }

}
