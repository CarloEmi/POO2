package Modelo;

/**
 * Estrategia de envío expreso, con un costo y tiempo de entrega más rápidos.
 */

public class EnvioExpreso implements EstrategiaEnvio {

    @Override
    public double calcularCosto() {
        return 100.0; // Costo fijo para envío expreso
    }

    @Override
    public int calcularTiempoEntrega() {
        return 2; // Tiempo de entrega en días
    }

}