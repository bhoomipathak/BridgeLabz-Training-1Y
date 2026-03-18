package com.gla.interfaces.DefaultMethodsInterfaces.DataExportFeature;


public interface DataExporter {
    void exportCSV();
    void exportPDF();
    default void exportToJSON() {
        System.out.println("Exporting data in JSON format.");
    }
}