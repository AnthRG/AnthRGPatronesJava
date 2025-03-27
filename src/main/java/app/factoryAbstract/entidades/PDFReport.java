package app.factoryAbstract.entidades;

public class PDFReport extends ReportGenerator {
    public PDFReport(int id, String estado) {
        super(id, estado);
    }

    public PDFReport() {
        super();
    }
    public String generateReport() {
        return "Generando reporte en PDF...";
    }

}
