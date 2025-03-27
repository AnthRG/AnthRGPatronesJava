package app.FactoryMethod.Entidades;

public class CryptoPayment implements Payment{
    @Override
    public String processPayment(double amount) {
        return "Esperando Comprobante";
    }
}
