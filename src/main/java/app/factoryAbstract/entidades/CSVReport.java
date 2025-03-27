package app.factoryAbstract.entidades;

import app.factoryAbstract.entidades.interfaces.ReportGenerator;

public class CSVReport implements ReportGenerator {
    public String generateReport() {
        return "Generando reporte en CSV...";
    }

}
