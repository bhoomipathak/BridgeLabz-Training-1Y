package com.gla.string.Level2;

import java.util.Scanner;

public class SplitText {

    public static int findLength(String str) {
        int count = 0;
        while (true) {
            try {
                str.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }

    public static String[] customSplit(String text) {

        int length = findLength(text);

        int wordCount = 1;
        int spaceCount = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
                spaceCount++;
            }
        }

        int[] spaceIndex = new int[spaceCount];
        int idx = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[idx++] = i;
            }
        }

        String[] words = new String[wordCount];

        int start = 0;
        int wordIndex = 0;

        for (int i = 0; i < spaceCount; i++) {
            words[wordIndex++] = text.substring(start, spaceIndex[i]);
            start = spaceIndex[i] + 1;
        }

        words[wordIndex] = text.substring(start);

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] customWords = customSplit(text);

        String[] builtInWords = text.split(" ");

        boolean result = compareArrays(customWords, builtInWords);

        System.out.println("\nWords using custom split:");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nAre both results same? " + result);

        sc.close();
    }
}
