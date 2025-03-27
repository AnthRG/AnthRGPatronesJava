package app.factoryAbstract.entidades;

import app.factoryAbstract.entidades.interfaces.ReportGenerator;

public class ExcelReport implements ReportGenerator {
    @Override
    public String generateReport() {
        return "Generando reporte en Excel...";
    }
}
