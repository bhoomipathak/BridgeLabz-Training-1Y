package com.gla.Inheritance.MultilevelInheritance.EducationalCourseHierarchy;
class Main {
    public static void main(String[] args) {
        PaidOnlineCourse c = new PaidOnlineCourse();
        c.courseName="Java";
        c.duration=30;
        c.platform="Udemy";
        c.isRecorded=true;
        c.fee=5000;
        c.discount=500;

        System.out.println(c.courseName + " " + c.duration + " " + c.platform + " " + c.fee);
    }
}
