package com.company.PrimeirosPassos.EstruturaSequencial;

public class Casting {
    public static void main(String[]args) {

        double a;
        int c;

        a = 5;
        c = (int) a;

        System.out.println(c);

        int x;
        double y;

        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);

        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;
        System.out.println(area);
    }
}
