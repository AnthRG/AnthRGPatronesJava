package app.factoryAbstract.entidades;

import app.factoryAbstract.entidades.interfaces.ReportGenerator;

public class PDFReport implements ReportGenerator {
    public String generateReport() {
        return "Generando reporte en PDF...";
    }

}
