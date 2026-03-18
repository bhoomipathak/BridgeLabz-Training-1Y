package com.gla.string.Level2;

import java.util.Scanner;

public class ShortestLongestWord {

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
        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }
        return data;
    }

    static int[] findShortestLongest(String[][] data) {
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < data.length; i++) {
            int curr = Integer.parseInt(data[i][1]);
            int min = Integer.parseInt(data[minIndex][1]);
            int max = Integer.parseInt(data[maxIndex][1]);

            if (curr < min)
                minIndex = i;
            if (curr > max)
                maxIndex = i;
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[][] data = wordLength2D(words);
        int[] result = findShortestLongest(data);

        System.out.println(data[result[0]][0]);
        System.out.println(data[result[1]][0]);

        sc.close();
    }
}

