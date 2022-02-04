package com.company.PrimeirosPassos.POO.NotPOO;

import java.util.Scanner;

public class ExerciseMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] mat = new int [n][n];

        // para percorrer as linhas i
        for (int i = 0; i < n; i++) {
            // para percorrer as colunas j
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        scanner.close();
    }
}
