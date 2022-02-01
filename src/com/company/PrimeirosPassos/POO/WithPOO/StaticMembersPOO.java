package com.company.PrimeirosPassos.POO.WithPOO;

import com.company.PrimeirosPassos.POO.util.CalculatorStatic;

import java.util.Locale;
import java.util.Scanner;

public class StaticMembersPOO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        double c = CalculatorStatic.circumference(radius);

        double v = CalculatorStatic.volume(radius);

        System.out.printf("Circumferece: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI Value: %.2f%n", CalculatorStatic .PI);

        scanner.close();
    }
}
