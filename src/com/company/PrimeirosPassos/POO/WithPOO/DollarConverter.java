package com.company.PrimeirosPassos.POO.WithPOO;

import com.company.PrimeirosPassos.POO.util.CalculatorStatic;
import com.company.PrimeirosPassos.POO.util.CurrencyConvert;

import java.util.Locale;
import java.util.Scanner;

public class DollarConverter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = scanner.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double amount = scanner.nextDouble();

        double result = CurrencyConvert.dollarTotal(amount, dollarPrice);
        System.out.printf("Amount to be paid in reais = %.2f%n", result);

    }
}
