package com.gla.problempractice1.level1;
import java.time.LocalDate;
import java.util.Scanner;

public class DateComparisonExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input first date
        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate date1 = LocalDate.parse(sc.nextLine());

        // Input second date
        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate date2 = LocalDate.parse(sc.nextLine());

        // Compare dates
        if (date1.isBefore(date2)) {
            System.out.println("First date is BEFORE the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is AFTER the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("Both dates are SAME.");
        }

        sc.close();
    }
}

