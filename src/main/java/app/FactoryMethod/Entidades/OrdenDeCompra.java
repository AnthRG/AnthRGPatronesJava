package app.FactoryMethod.Entidades;

public class OrdenDeCompra {
    private int id;
    private double pago;
    private String metodoPago;
    private Boolean completada;

    public OrdenDeCompra(int id, double pago, String metodoPago, Boolean completada) {
        this.id = id;
        this.pago = pago;
        this.metodoPago = metodoPago;
        this.completada = completada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Boolean getCompletada() {
        return completada;
    }

    public void setCompletada(Boolean completada) {
        this.completada = completada;
    }
}
