package com.company.PrimeirosPassos.POO.WithPOO;

import com.company.PrimeirosPassos.POO.Entities.Rent;

import java.text.ParseException;
import java.util.Scanner;

public class ExerciseRent {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Room: ");
            int room = scanner.nextInt();
            vect[room] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        scanner.close();
    }
}
