package com.gla.jbbc;
import java.util.*;

class Task {
    int id;
    String title;
    String status; // "Pending" or "Completed"

    Task(int id, String title, String status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }
}

public class ToDoTaskManager {

    static ArrayList<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {

        // CREATE (Add tasks)
        tasks.add(new Task(1, "Complete Java assignment", "Pending"));
        tasks.add(new Task(2, "Buy groceries", "Pending"));
        tasks.add(new Task(3, "Read book", "Completed"));

        // READ (show Pending tasks)
        System.out.println("Pending Tasks:");
        for (Task t : tasks) {
            if (t.status.equalsIgnoreCase("Pending")) {
                System.out.println(t.id + " | " + t.title + " | " + t.status);
            }
        }

        // UPDATE (mark task as Completed)
        int updateId = 2;

        for (Task t : tasks) {
            if (t.id == updateId) {
                t.status = "Completed";
                System.out.println("Task Completed: " + t.title);
            }
        }

        // DELETE (remove completed tasks)
        tasks.removeIf(t -> t.status.equalsIgnoreCase("Completed"));

        // Final List
        System.out.println("\nFinal Task List:");
        for (Task t : tasks) {
            System.out.println(t.id + " | " + t.title + " | " + t.status);
        }
    }
}
