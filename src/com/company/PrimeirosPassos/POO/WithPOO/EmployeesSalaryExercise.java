package com.company.PrimeirosPassos.POO.WithPOO;

import com.company.PrimeirosPassos.POO.Entities.EmployeesSalary;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeesSalaryExercise {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<EmployeesSalary> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = scanner.nextInt();
            while (hasId(list, id)) {
                System.out.println("Id already taken! Try again: ");
                id = scanner.nextInt();
            }

            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            EmployeesSalary emp = new EmployeesSalary(id, name, salary);

            list.add(emp);

        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int idsalary = scanner.nextInt();

        EmployeesSalary emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = scanner.nextDouble();
            emp.increaseSalary(percent);
        }

        /* OUTRA OPÇÃO DE RESOLUÇÃO
        Integer posisicao = position(list, idsalary);
        if (posisicao == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double percent = scanner.nextDouble();
            list.get(posisicao).increaseSalary(percent);
        }
        System.out.println();
        System.out.println("List of employees: ");
        for (EmployeesSalary emp : list) {
            System.out.println(emp);
        }
        */

        System.out.println();
        System.out.println("List of employees: ");
        // NÃO pode usar a palavra 'emp' mais
        for (EmployeesSalary e : list) {
            System.out.println(e);
        }

        scanner.close();
    }

    // PUBLIC é OPCIONAL, porque já está implícito, e STATIC porque o MAIN também é static!
    public static Integer position(List<EmployeesSalary> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<EmployeesSalary> list, int id) {
        EmployeesSalary emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
