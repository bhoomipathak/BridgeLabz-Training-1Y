package com.gla.classesobjects.Level2;

class Student {
    String name;
    int rollNumber;
    int marks;
    Student(String n,int r,int m){
        name=n;
        rollNumber=r;
        marks=m;
    }
    String grade(){
        if(marks>=90) return "A";
        else if(marks>=75) return "B";
        else if(marks>=60) return "C";
        else if(marks>=40) return "D";
        else return "F";
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+rollNumber);
        System.out.println("Marks: "+marks);
        System.out.println("Grade: "+grade());
    }
    public static void main(String args[]){
        Student s=new Student("Anubhav",12,82);
        s.display();
    }
}
