package com.gla.string.Level1;

import java.util.Scanner;

class IllegalArgumentDemo {

    public static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }

    public static void handleException(String text) {

        try {
            System.out.println(text.substring(5, 2));
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        try {
            generateException(text);
        } catch (RuntimeException e) {
            System.out.println("Exception generated in generateException()");
        }

        handleException(text);
    }
}

