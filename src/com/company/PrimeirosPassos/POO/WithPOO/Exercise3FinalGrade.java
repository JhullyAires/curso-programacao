package com.company.PrimeirosPassos.POO.WithPOO;

import com.company.PrimeirosPassos.POO.Entities.FinalGrade;
import java.util.Locale;
import java.util.Scanner;

public class Exercise3FinalGrade {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        FinalGrade finalGrade = new FinalGrade();

        System.out.print("Student's name: ");
        finalGrade.name = scanner.nextLine();
        System.out.print("first quarter grade: ");
        finalGrade.firstTrimester = scanner.nextDouble();
        System.out.print("second trimester grade: ");
        finalGrade.secondTrimester = scanner.nextDouble();
        System.out.print("third quarter grade: ");
        finalGrade.thirdTrimester = scanner.nextDouble();


        System.out.println();
        System.out.printf("FINAL GRADE: %.2f%n ", finalGrade.totalFinalGrade());
        System.out.println();

        if (finalGrade.totalFinalGrade() < 60.0) {
            System.out.println("FAILED!");
            System.out.printf("MISSING %.2f POINTS%n ", finalGrade.missingPoints());
        } else {
            System.out.println("PASS!");
        }

        scanner.close();

    }
}
