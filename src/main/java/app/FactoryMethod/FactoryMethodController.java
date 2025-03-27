package app.FactoryMethod;

import app.FactoryMethod.Entidades.*;
import app.Singleton.Log;
import app.Singleton.Registro;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FactoryMethodController {

    public static void procesarPago(@NotNull Context ctx) throws Exception {
         // Simula la selección del usuario en tiempo de ejecución
        String selectedMethod = ctx.pathParam("method");
        Payment payment = getPaymentMethod(selectedMethod);
        payment.processPayment(100.50);
        ctx.redirect("/");
    }

    public static void listar(@NotNull Context ctx) throws Exception {
        List<OrdenDeCompra> lista = PaymentFactory.getInstance().getMisOrdenes();
        Map<String, Object> modelo = new HashMap<>();
        modelo.put("titulo", "Listado de Registros");
        modelo.put("lista", lista);
        ctx.render("templates/singleton/listar.html", modelo);
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


