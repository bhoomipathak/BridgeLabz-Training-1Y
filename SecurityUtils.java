package com.gla.interfaces.StaticMethodsInInterfaces.PasswordStrengthValidator;

public interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8;
    }
}
