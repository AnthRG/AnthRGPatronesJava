package app.factoryAbstract.factory;

import app.factoryAbstract.entidades.ExcelReport;
import app.factoryAbstract.entidades.interfaces.ReportGenerator;

public class ExcelReportFactory implements ReportFactory{
    @Override
    public ReportGenerator createReport() {
        return new ExcelReport();
    }
}
