package com.gla.string.Level2;

import java.util.Scanner;

public class CharacterType {

    static String checkChar(char ch) {

        if (ch >= 'A' && ch <= 'Z')
            ch = (char)(ch + 32);

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

    static String[][] findCharTypes(String str) {

        int len = 0;
        while (true) {
            try {
                str.charAt(len);
                len++;
            } catch (Exception e) {
                break;
            }
        }

        String[][] data = new String[len][2];

        for (int i = 0; i < len; i++) {
            data[i][0] = String.valueOf(str.charAt(i));
            data[i][1] = checkChar(str.charAt(i));
        }
        return data;
    }

    static void display(String[][] data) {

        System.out.println("Character\tType");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] result = findCharTypes(text);
        display(result);

        sc.close();
    }
}
