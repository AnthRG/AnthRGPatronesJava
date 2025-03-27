package app.FactoryMethod;

import app.FactoryMethod.Entidades.*;
import app.Singleton.Log;
import app.Singleton.Registro;

import java.util.ArrayList;
import java.util.List;

public class PaymentFactory {
    private static List<OrdenDeCompra> misOrdenes;
    private static PaymentFactory instance;

    private PaymentFactory() {
        super();
        misOrdenes = new ArrayList<>();
    } // Constructor privado

    public static PaymentFactory getInstance() {
        if (instance == null) {
            instance = new PaymentFactory();
        }
        return instance;
    }

    public void addOrdenDeCompra(Double pago, String metodo, String estado) {
        int id = misOrdenes.size() + 1;
        misOrdenes.add(new OrdenDeCompra(id,pago,metodo,estado));
    }

    public List<OrdenDeCompra> getMisOrdenes() {
        return misOrdenes;
    }


}
