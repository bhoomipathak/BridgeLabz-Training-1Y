package com.gla.encapsulation.EmployeeManagementSystem;
public class FullTimeEmployee extends Employee implements Department {
    private String department;
    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public double calculateSalary() {
        return baseSalary + 5000;   // fixed allowance
    }
    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }
    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

