package app.FactoryMethod;

import app.FactoryMethod.Entidades.Payment;
import app.Singleton.Log;
import app.Singleton.Registro;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FactoryMethodController {
     // Procesa el pago con el método elegido

    public static void pago(@NotNull Context ctx) throws Exception {
        String selectedMethod = "paypal"; // Simula la selección del usuario en tiempo de ejecución
        Payment payment = PaymentFactory.getPaymentMethod(selectedMethod);
        payment.processPayment(100.50);
        List<Log> lista = Registro.getInstance().getLogList();
        Map<String, Object> modelo = new HashMap<>();
        modelo.put("titulo", "Listado de Registros");
        modelo.put("lista", lista);
        ctx.render("templates/singleton/listar.html", modelo);
    }
}
