package com.gla.constructors.AccessModifiers;

class Student{
    public int rollNumber;
    protected String name;
    private double cgpa;
    public Student(int r, String n, double c) {
        rollNumber = r;
        name = n;
        cgpa = c;
    }
    public double getCgpa() {
        return cgpa;
    }
    public void setCgpa(double c) {
        cgpa = c;
    }
}
class PostgraduateStudent extends Student {
    public PostgraduateStudent(int r, String n, double c) {
        super(r, n, c);
    }
    void display() {
        System.out.println(rollNumber);
        System.out.println(name);
        System.out.println(getCgpa());
    }
    public static void main(String args[]) {
        PostgraduateStudent p = new PostgraduateStudent(1,"Anubhav",8.5);
        p.display();
        p.setCgpa(9.1);
        System.out.println(p.getCgpa());
    }
}

