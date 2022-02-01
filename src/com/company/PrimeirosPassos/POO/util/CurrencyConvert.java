package com.company.PrimeirosPassos.POO.util;

public class CurrencyConvert {

    public static double IOF = 0.06;

    public static double dollarTotal(double amount, double dollarPrice) {
        return amount * dollarPrice * (1.0 + IOF);
    }
}
