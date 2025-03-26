package app.Singleton;

public class Log {
    int id;
    String mensaje;

    public Log(int id, String mensaje) {
        this.id = id;
        this.mensaje = mensaje;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
