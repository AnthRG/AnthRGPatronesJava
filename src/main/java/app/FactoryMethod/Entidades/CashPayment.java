package app.FactoryMethod.Entidades;

public class CashPayment implements Payment{
    @Override
    public String processPayment(double amount) {
        return "Esperando Recivo";
    }
}
