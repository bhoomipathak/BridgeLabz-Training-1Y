package com.gla.interfaces.FunctionalInterfaces.StringLengthChecker;

public class StringLengthCheckerDemo {
    public static void main(String[] args) {
        LengthValidator validator = msg -> msg.length() <= 20;
        String message = "Hello Interfaces";
        if (validator.validate(message)) {
            System.out.println("Message within limit.");
        } else {
            System.out.println("Message exceeds limit.");
        }
    }
}