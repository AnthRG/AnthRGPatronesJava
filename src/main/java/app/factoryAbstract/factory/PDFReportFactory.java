package app.factoryAbstract.factory;

import app.factoryAbstract.entidades.PDFReport;
import app.factoryAbstract.entidades.interfaces.ReportGenerator;

public class PDFReportFactory implements ReportFactory{
    @Override
    public ReportGenerator createReport() {
        return new PDFReport();
    }
}
