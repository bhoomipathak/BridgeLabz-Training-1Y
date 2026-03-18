package com.gla.string.Level2;

import java.util.Scanner;

public class WordLength2D {

    static int findLength(String str) {
        int count = 0;
        while (true) {
            try {
                str.charAt(count);
                count++;
            } catch (Exception e) {
                break;
            }
        }
        return count;
    }

    static String[] customSplit(String text) {
        int len = findLength(text);
        int words = 1;

        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ')
                words++;

        String[] arr = new String[words];
        int start = 0, index = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                arr[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        arr[index] = text.substring(start);
        return arr;
    }

    static String[][] wordLength2D(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[][] data = wordLength2D(words);

        System.out.println("\nWord\tLength");

        for (int i = 0; i < data.length; i++) {
            int length = Integer.parseInt(data[i][1]);
            System.out.println(data[i][0] + "\t" + length);
        }

        sc.close();
    }
}
