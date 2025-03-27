package app.factoryAbstract.entidades;

public class ReportGenerator {
    int id;
    String estado;

    public ReportGenerator(int id, String estado) {
        this.id = id;
        this.estado = estado;
    }

    public ReportGenerator() {
    }

    public String generateReport(){
       return "error";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
