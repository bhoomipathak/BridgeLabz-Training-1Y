package com.gla.interfaces.FunctionalInterfaces.SimpleTaskExecution;

public class SimpleTaskExecutionDemo {
    public static void main(String[] args) {
        Task task = () -> System.out.println("Task executed successfully.");
        task.perform();
    }
}
