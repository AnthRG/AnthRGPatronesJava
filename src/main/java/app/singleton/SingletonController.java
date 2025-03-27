package app.singleton;

import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingletonController {

    public static void listar(@NotNull Context ctx) throws Exception {
        List<Log> lista = Registro.getInstance().getLogList();
        Map<String, Object> modelo = new HashMap<>();
        modelo.put("titulo", "Listado de Registros");
        modelo.put("lista", lista);
        ctx.render("templates/singleton/listar.html", modelo);
    }


    public static void crear(@NotNull Context ctx) throws Exception {
        String mensaje = ctx.formParam("mensaje");
        Registro.getInstance().log(mensaje);
        ctx.redirect("/ejemploSingleton");
    }
}
