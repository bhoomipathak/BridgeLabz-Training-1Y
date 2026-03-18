package com.gla.interfaces.StaticMethodsInInterfaces.DateFormatUtility;

public class DateFormatUtilityDemo {
    public static void main(String[] args) {
        String formattedDate = DateFormatterUtil.formatDate("20", "02", "2026");
        System.out.println("Formatted Date: " + formattedDate);
    }
}
