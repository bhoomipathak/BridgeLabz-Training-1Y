package com.gla.Inheritance.AssistedProblems.EmployeeManagementSystem;
class Developer extends Employee {
    String programmingLanguage;
    void displayDetails() {
        System.out.println(name + " " + id + " " + salary + " " + programmingLanguage);
    }
}
