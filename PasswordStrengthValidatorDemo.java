package com.gla.interfaces.StaticMethodsInInterfaces.PasswordStrengthValidator;

public class PasswordStrengthValidatorDemo {
    public static void main(String[] args) {
        String password = "abc12345";
        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}
