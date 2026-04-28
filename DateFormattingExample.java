package com.gla.problempractice1.level1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormattingExample {
    public static void main(String[] args) {

        // Get current date
        LocalDate currentDate = LocalDate.now();

        // Define different format patterns
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Display formatted dates
        System.out.println("Format 1 (dd/MM/yyyy): " + currentDate.format(format1));
        System.out.println("Format 2 (yyyy-MM-dd): " + currentDate.format(format2));
        System.out.println("Format 3 (EEE, MMM dd, yyyy): " + currentDate.format(format3));
    }
}

