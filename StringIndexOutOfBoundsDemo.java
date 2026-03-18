package com.gla.string.Level1;

import java.util.Scanner;

class StringIndexOutOfBoundsDemo {

    public static void generateException(String text) {
        // Accessing index beyond string length
        System.out.println(text.charAt(text.length()));
    }

    public static void handleException(String text) {

        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception generated in generateException()");
        }

        handleException(text);
    }
}

