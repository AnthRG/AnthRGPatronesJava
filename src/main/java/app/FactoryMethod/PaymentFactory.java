package app.FactoryMethod;

import app.FactoryMethod.Entidades.*;

public class PaymentFactory {
    public static Payment getPaymentMethod(String type) {
        switch (type.toLowerCase()) {
            case "creditcard":
                return new CreditCardPayment();
            case "paypal":
                return new PayPalPayment();
            case "crypto":
                return new CryptoPayment();
            case "cash":
                return new CashPayment();
            default:
                throw new IllegalArgumentException("Método de pago no soportado");
        }
    }

}
