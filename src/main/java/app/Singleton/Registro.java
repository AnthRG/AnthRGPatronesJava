package app.Singleton;

import java.util.ArrayList;
import java.util.List;

public class Registro {
    private static List<Log> LogList;
    private static Registro instance;

    private Registro() {
        super();
        LogList = new ArrayList<>();
    } // Constructor privado

    public static Registro getInstance() {
        if (instance == null) {
            instance = new Registro();
        }
        return instance;
    }

    public void log(String message) {
        int id = LogList.size() + 1;
        LogList.add(new Log(id, message));
    }

    public List<Log> getLogList() {
        return LogList;
    }
}
