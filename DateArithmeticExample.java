package com.gla.problempractice1.level1;
import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmeticExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input date (format: yyyy-MM-dd)
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = sc.nextLine();

        // Convert string to LocalDate
        LocalDate date = LocalDate.parse(inputDate);

        // Add 7 days, 1 month, and 2 years
        LocalDate updatedDate = date
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2);

        // Subtract 3 weeks
        updatedDate = updatedDate.minusWeeks(3);

        // Output results
        System.out.println("Original Date: " + date);
        System.out.println("After Adding & Subtracting: " + updatedDate);

        sc.close();
    }
}

