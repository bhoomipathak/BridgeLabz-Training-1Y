package com.gla.interfaces.StaticMethodsInInterfaces.DateFormatUtility;

public interface DateFormatterUtil {
    static String formatDate(String day, String month, String year) {
        return day + "-" + month + "-" + year;
    }
}
