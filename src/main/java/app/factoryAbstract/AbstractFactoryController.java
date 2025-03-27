package app.factoryAbstract;

import app.factoryAbstract.entidades.ReportGenerator;
import app.factoryAbstract.factory.CSVReportFactory;
import app.factoryAbstract.factory.ExcelReportFactory;
import app.factoryAbstract.factory.PDFReportFactory;
import app.factoryAbstract.factory.ReportFactory;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

public class AbstractFactoryController {
    public static void generacion(@NotNull Context ctx) throws Exception {
        String format = ctx.queryParam("format"); // "pdf", "excel", "csv"

        ReportFactory factory;

        switch (format) {
            case "excel":
                factory = new ExcelReportFactory();
                break;
            case "csv":
                factory = new CSVReportFactory();
                break;
            default:
                factory = new PDFReportFactory();
                break;
        }

        ReportGenerator report = factory.createReport();
        ctx.result(report.generateReport());
    }
}
