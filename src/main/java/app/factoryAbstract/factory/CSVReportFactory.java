package app.factoryAbstract.factory;

import app.factoryAbstract.entidades.CSVReport;
import app.factoryAbstract.entidades.interfaces.ReportGenerator;

public class CSVReportFactory implements ReportFactory{
    @Override
    public ReportGenerator createReport() {
        return new CSVReport();
    }

}
