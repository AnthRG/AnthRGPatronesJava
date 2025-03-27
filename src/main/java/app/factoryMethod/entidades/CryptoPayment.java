package app.factoryMethod.entidades;

public class CryptoPayment implements Payment{
    @Override
    public String processPayment(double amount) {
        return "Esperando Comprobante";
    }
}
