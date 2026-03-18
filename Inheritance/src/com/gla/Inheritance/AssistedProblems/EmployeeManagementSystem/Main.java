package com.gla.Inheritance.AssistedProblems.EmployeeManagementSystem;
class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name="A"; m.id=1; m.salary=50000; m.teamSize=5;
        Developer d = new Developer();
        d.name="B"; d.id=2; d.salary=40000; d.programmingLanguage="Java";
        Intern i = new Intern();
        i.name="C"; i.id=3; i.salary=20000; i.duration="3 months";
        m.displayDetails();
        d.displayDetails();
        i.displayDetails();
    }
}
