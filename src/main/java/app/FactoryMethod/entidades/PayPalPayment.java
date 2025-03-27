package app.FactoryMethod.entidades;

public class PayPalPayment implements Payment{
    @Override
    public String processPayment(double amount) {
        return "Esperando a Paypal";
    }
}
