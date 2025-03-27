package app.factoryAbstract.entidades;

public class ExcelReport extends ReportGenerator {
    public ExcelReport(int id, String estado) {
        super(id, estado);
    }

    public ExcelReport() {
        super();
    }
    @Override
    public String generateReport() {
        return "Generando reporte en Excel...";
    }
}
