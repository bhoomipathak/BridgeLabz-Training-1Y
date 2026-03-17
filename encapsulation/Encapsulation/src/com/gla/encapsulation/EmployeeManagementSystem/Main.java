package com.gla.encapsulation.EmployeeManagementSystem;
public class Main{
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee(101, "Anubhav", 30000);
        Employee emp2 = new PartTimeEmployee(102, "Rahul", 500, 20);
        Department dept1 = (Department) emp1;
        Department dept2 = (Department) emp2;
        dept1.assignDepartment("IT");
        dept2.assignDepartment("Support");
        Employee[] employees = { emp1, emp2 };
        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("Department: " + ((Department) e).getDepartmentDetails());
            System.out.println("------------------------");
        }
    }
}
