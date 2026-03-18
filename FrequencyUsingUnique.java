package com.gla.string.Level3;
import java.util.Scanner;

public class FrequencyUsingUnique {

    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    static char[] uniqueCharacters(String text) {

        int length = findLength(text);
        char[] temp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (ch == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = ch;
                uniqueCount++;
            }
        }

        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    static String[][] characterFrequency(String text) {

        int[] freq = new int[256];
        int i = 0;

        try {
            while (true) {
                char ch = text.charAt(i);
                freq[ch]++;
                i++;
            }
        } catch (Exception e) {
        }

        char[] uniqueChars = uniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        for (i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[][] result = characterFrequency(input);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " : " + result[i][1]);
        }
    }
}

