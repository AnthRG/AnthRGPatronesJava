package app.FactoryMethod.Entidades;

public class PayPalPayment implements Payment{
    @Override
    public String processPayment(double amount) {
        return "Esperando a Paypal";
    }
}
