package app.factoryAbstract.factory;

import app.factoryAbstract.entidades.CSVReport;
import app.factoryAbstract.entidades.ReportGenerator;

public class CSVReportFactory extends ReportFactory{
    @Override
    public ReportGenerator createReport() {
        return new CSVReport();
    }

}
