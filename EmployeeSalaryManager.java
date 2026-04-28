package com.gla.jbbc;
import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeSalaryManager {
    static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {

        // CREATE (Add employees)
        employees.add(new Employee(1, "Rahul", 25000));
        employees.add(new Employee(2, "Amit", 40000));
        employees.add(new Employee(3, "Neha", 12000));

        // READ (salary > 30000)
        System.out.println("Employees with salary > 30000:");
        for (Employee e : employees) {
            if (e.salary > 30000) {
                System.out.println(e.id + " " + e.name + " " + e.salary);
            }
        }

        // UPDATE (increase salary by 10%)
        int updateId = 1;
        for (Employee e : employees) {
            if (e.id == updateId) {
                e.salary = e.salary * 1.10;
                System.out.println("Updated Salary of ID " + updateId + ": " + e.salary);
            }
        }

        // DELETE (salary < 15000)
        employees.removeIf(e -> e.salary < 15000);

        // Final List
        System.out.println("\nFinal Employee List:");
        for (Employee e : employees) {
            System.out.println(e.id + " " + e.name + " " + e.salary);
        }
    }
}

