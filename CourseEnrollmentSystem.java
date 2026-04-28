package com.gla.jbbc;
import java.util.*;

class Enrollment {
    int id;
    String student;
    String course;

    Enrollment(int id, String student, String course) {
        this.id = id;
        this.student = student;
        this.course = course;
    }
}

public class CourseEnrollmentSystem {

    static ArrayList<Enrollment> enrollments = new ArrayList<>();

    public static void main(String[] args) {

        // CREATE (Add enrollments)
        enrollments.add(new Enrollment(1, "Rahul", "Java"));
        enrollments.add(new Enrollment(2, "Amit", "Python"));
        enrollments.add(new Enrollment(3, "Neha", "Java"));

        // READ (show enrollments for specific course)
        String searchCourse = "Java";
        System.out.println("Students enrolled in " + searchCourse + ":");

        for (Enrollment e : enrollments) {
            if (e.course.equalsIgnoreCase(searchCourse)) {
                System.out.println(e.id + " | " + e.student + " | " + e.course);
            }
        }

        // UPDATE (change student's course)
        int updateId = 2;
        String newCourse = "Data Science";

        for (Enrollment e : enrollments) {
            if (e.id == updateId) {
                e.course = newCourse;
                System.out.println("Updated course for " + e.student + ": " + e.course);
            }
        }

        // DELETE (cancel enrollment)
        int deleteId = 3;
        enrollments.removeIf(e -> e.id == deleteId);

        // Final List
        System.out.println("\nFinal Enrollment List:");
        for (Enrollment e : enrollments) {
            System.out.println(e.id + " | " + e.student + " | " + e.course);
        }
    }
}
