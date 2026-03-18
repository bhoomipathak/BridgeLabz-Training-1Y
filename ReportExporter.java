package com.gla.interfaces.DefaultMethodsInterfaces.DataExportFeature;

public class ReportExporter implements DataExporter {
    @Override
    public void exportCSV() {
        System.out.println("Exporting data as CSV.");
    }
    @Override
    public void exportPDF() {
        System.out.println("Exporting data as PDF.");
    }
}
