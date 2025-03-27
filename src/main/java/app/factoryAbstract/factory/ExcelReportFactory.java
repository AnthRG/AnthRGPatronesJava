package app.factoryAbstract.factory;

import app.factoryAbstract.entidades.ExcelReport;
import app.factoryAbstract.entidades.ReportGenerator;

public class ExcelReportFactory extends ReportFactory{
    @Override
    public ReportGenerator createReport() {
        return new ExcelReport();
    }
}
