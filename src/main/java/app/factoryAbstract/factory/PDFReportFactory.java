package app.factoryAbstract.factory;

import app.factoryAbstract.entidades.PDFReport;
import app.factoryAbstract.entidades.ReportGenerator;

public class PDFReportFactory extends ReportFactory{
    @Override
    public ReportGenerator createReport() {
        return new PDFReport();
    }
}
