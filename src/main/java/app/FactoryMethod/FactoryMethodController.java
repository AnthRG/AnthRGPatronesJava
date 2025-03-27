package app.FactoryMethod;

import app.FactoryMethod.entidades.*;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FactoryMethodController {

    public static void procesarPago(@NotNull Context ctx) throws Exception {
        String selectedMethod = ctx.formParam("method");
        String pagoString = ctx.formParam("pago");
        double pago = Double.parseDouble(pagoString);
        Payment payment = getPaymentMethod(selectedMethod);
        String estado = payment.processPayment(pago);
        PaymentFactory.getInstance().addOrdenDeCompra(pago,selectedMethod,estado);
        ctx.redirect("/ejemploFactoryMethod");
    }

    public static void listar(@NotNull Context ctx) throws Exception {
        List<OrdenDeCompra> lista = PaymentFactory.getInstance().getMisOrdenes();
        Map<String, Object> modelo = new HashMap<>();
        modelo.put("titulo", "Ordenes de Compra");
        modelo.put("lista", lista);
        ctx.render("templates/Factory/listar.html", modelo);
    }

    public static Payment getPaymentMethod(String type) {
        return switch (type.toLowerCase()) {
            case "creditcard" -> new CreditCardPayment();
            case "paypal" -> new PayPalPayment();
            case "crypto" -> new CryptoPayment();
            case "cash" -> new CashPayment();
            default -> throw new IllegalArgumentException("Método de pago no soportado");
        };
    }

}


