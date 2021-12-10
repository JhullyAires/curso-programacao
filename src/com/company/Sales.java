package com.company;

import java.util.Locale;

public class Sales {
    public static void main(String[]args){
        String product1="Computer";
        String product2="Office desk";

        int age=30;
        int code=52680;
        char gender='F';

        double price1=2100.0;
        double price2=650.50;
        double measure=53.234567;

        System.out.printf("%s, which price is $ %.4f%n",product1,price1);
        System.out.printf("%s, which price is $ %.4f%n",product2,price2);

        System.out.printf("Measue with decimal places: %.4f%n",measure);
        System.out.printf("Rouded (three decimal places): %.3f%n",measure);

        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n",measure);
    }
}