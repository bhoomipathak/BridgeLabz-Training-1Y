package com.gla.encapsulation.EmployeeManagementSystem;
public class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private String department;
    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, hourlyRate);
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary() {
        return baseSalary * hoursWorked;
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
