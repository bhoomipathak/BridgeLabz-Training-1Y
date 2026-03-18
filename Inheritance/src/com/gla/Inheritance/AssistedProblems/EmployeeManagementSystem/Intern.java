package com.gla.Inheritance.AssistedProblems.EmployeeManagementSystem;
class Intern extends Employee {
    String duration;
    void displayDetails() {
        System.out.println(name + " " + id + " " + salary + " " + duration);
    }
}
