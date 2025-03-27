package app.FactoryMethod.entidades;

public class CreditCardPayment implements Payment{
    @Override
    public String processPayment(double amount) {
        return "Completado";
    }
}
