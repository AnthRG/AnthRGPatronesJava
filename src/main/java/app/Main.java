package app;

import app.Singleton.SingletonController;
import app.FactoryMethod.FactoryMethodController;
import io.javalin.Javalin;
import io.javalin.http.sse.SseClient;
import io.javalin.http.staticfiles.Location;
import io.javalin.plugin.bundled.RouteOverviewPlugin;
import io.javalin.rendering.template.JavalinThymeleaf;
import org.eclipse.jetty.websocket.api.Session;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import static j2html.TagCreator.*;
import static j2html.TagCreator.a;

public class Main {

    //Creando el repositorio de las sesiones recibidas.
    public static List<Session> usuariosConectados = new ArrayList<>();
    public static List<SseClient> listaSseUsuario = new ArrayList<>();

    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
        resolver.setTemplateMode(TemplateMode.HTML);
        resolver.setCacheable(true);
        templateEngine.setTemplateResolver(resolver);

        Javalin app = Javalin.create(javalinConfig -> {
            javalinConfig.staticFiles.add("/publico"); // Archivos estáticos
            javalinConfig.fileRenderer(new JavalinThymeleaf(templateEngine)); // Configurar Thymeleaf
        }).start(getHerokuAssignedPort());

        app.get("/", ctx -> {
            String tramaHtml = html(
                    j2html.TagCreator.head(
                            title("Patrones de diseño creacionales"),
                            meta().withCharset("utf-8")
                    ),
                    body(
                            h1("Patrones de Diseño Creacionales"),
                            h2(a("Singleton").withHref("/ejemploSingleton")),
                            h2(a("Factory Method").withHref("/ejemploFactoryMethod")),
                            h2(a("Abstract Factory").withHref("/ejemploAbstractFactory")),
                            h2(a("Builder").withHref("/ejemploBuilder")),
                            h2(a("Prototipo").withHref("/ejemploPrototipo"))
                    )).render();
            ctx.html(tramaHtml);
        });


        app.get("/ejemploSingleton", SingletonController::listar);
        app.post("/ejemploSingleton/crear", SingletonController::crear);

        app.get("/ejemploFactoryMethod", ctx -> ctx.render("templates/Factory/paymentSelection.html"));
        app.post("/ejemploFactoryMethod/pago", FactoryMethodController::procesarPago);


    }


    /**
     * Metodo para indicar el puerto en Heroku
     * @return
     */
    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 7000; //Retorna el puerto por defecto en caso de no estar en Heroku.
    }
}
