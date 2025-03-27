package app.FactoryMethod.Entidades;

public class OrdenDeCompra {
    private int id;
    private double pago;
    private String metodoPago;
    private String estado;

    public OrdenDeCompra(int id, double pago, String metodoPago, String completada) {
        this.id = id;
        this.pago = pago;
        this.metodoPago = metodoPago;
        this.estado = completada;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
