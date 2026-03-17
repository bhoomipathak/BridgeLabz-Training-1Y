package com.gla.classesobjects.Level1;

class Employee {
    String name;
    int id;
    double salary;
    Employee(String n,int i,double s){
        name=n;
        id=i;
        salary=s;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+salary);
    }
    public static void main(String args[]){
        Employee e=new Employee("Anubhav",101,50000);
        e.display();
    }
}
