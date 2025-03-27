package app.FactoryMethod.entidades;

public class CashPayment implements Payment{
    @Override
    public String processPayment(double amount) {
        return "Esperando Recivo";
    }
}
