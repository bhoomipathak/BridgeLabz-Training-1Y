package com.gla.constructors.AccessModifiers;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;
    public Employee(int id,String d,double s) {
        employeeID=id;
        department=d;
        salary=s;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double s) {
        salary=s;
    }
}
class Manager extends Employee {
    public Manager(int id,String d,double s) {
        super(id,d,s);
    }
    void display() {
        System.out.println(employeeID);
        System.out.println(department);
        System.out.println(getSalary());
    }
    public static void main(String args[]) {
        Manager m=new Manager(201,"IT",60000);
        m.display();
        m.setSalary(75000);
        System.out.println(m.getSalary());
    }
}
