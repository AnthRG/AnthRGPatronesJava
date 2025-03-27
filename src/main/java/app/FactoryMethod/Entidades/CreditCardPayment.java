package app.FactoryMethod.Entidades;

public class CreditCardPayment implements Payment{
    @Override
    public String processPayment(double amount) {
        return "Completado";
    }
}
