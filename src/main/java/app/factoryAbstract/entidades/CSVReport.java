package app.factoryAbstract.entidades;

public class CSVReport extends ReportGenerator {
    public CSVReport(int id, String estado) {
        super(id, estado);
    }

    public CSVReport() {
        super();
    }

    public String generateReport() {
        return "Generando reporte en CSV...";
    }

}
