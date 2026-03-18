package com.gla.string.Level1;

import java.util.Scanner;

class CharArrayCompare {
    public static char[] getCharacters(String str) {

        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        return arr;
    }

    public static boolean compareCharArrays(char[] a1, char[] a2) {

        if (a1.length != a2.length) {
            return false;
        }

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] userArray = getCharacters(text);

        char[] builtInArray = text.toCharArray();

        boolean result = compareCharArrays(userArray, builtInArray);

        System.out.print("\nCharacters using charAt(): ");
        for (char c : userArray) {
            System.out.print(c + " ");
        }

        System.out.print("\nCharacters using toCharArray(): ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        if (result) {
            System.out.println("\nBoth character arrays are SAME");
        } else {
            System.out.println("\nBoth character arrays are DIFFERENT");
        }
    }
}

