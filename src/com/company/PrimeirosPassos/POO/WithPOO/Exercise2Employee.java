package com.company.PrimeirosPassos.POO.WithPOO;

import com.company.PrimeirosPassos.POO.Entities.EmployeeData;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2Employee {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        EmployeeData employeeData = new EmployeeData();

        System.out.print("Name: ");
        employeeData.name = scanner.nextLine();
        System.out.print("Gross Salary: ");
        employeeData.grossSalary = scanner.nextDouble();
        System.out.print("Tax: ");
        employeeData.tax = scanner.nextDouble();

        System.out.println();
        System.out.println("Employee: " + employeeData);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = scanner.nextDouble();
        employeeData.IncreaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + employeeData);

        scanner.close();

    }
}
