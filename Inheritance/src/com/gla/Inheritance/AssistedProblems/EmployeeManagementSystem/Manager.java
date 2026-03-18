package com.gla.Inheritance.AssistedProblems.EmployeeManagementSystem;
class Manager extends Employee {
    int teamSize;
    void displayDetails() {
        System.out.println(name + " " + id + " " + salary + " " + teamSize);
    }
}
