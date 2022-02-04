package com.company.PrimeirosPassos.POO.Entities;

public class EmployeesSalary {
    private Integer id;
    private String name;
    private Double salary;

    public EmployeesSalary() {

    }

    public EmployeesSalary(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100.0;
    }

    @Override // ele ajuda a não errar, mesmo seu uso não sendo obrigatório
    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
}
