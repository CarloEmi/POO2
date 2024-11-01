package Modelo;

/**
 * Estrategia de envío regular, con un costo y tiempo de entrega estándar.
 */

public class EnvioRegular implements EstrategiaEnvio {

    @Override
    public double calcularCosto() {
        return 50.0; // Costo fijo para envío regular
    }

    @Override
    public int calcularTiempoEntrega() {
        return 5; // Tiempo de entrega en días
    }

}
