package com.gla.encapsulation.EmployeeManagementSystem;
public abstract class Employee {
    private int employeeId;
    private String name;
    protected double baseSalary;
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    // Getters
    public int getEmployeeId() {
        return employeeId;
    }
    public String getName() {
        return name;
    }
    // Setter
    public void setName(String name) {
        this.name = name;
    }
    // Abstract Method
    public abstract double calculateSalary();
    // Concrete Method
    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Final Salary: " + calculateSalary());
    }
}

