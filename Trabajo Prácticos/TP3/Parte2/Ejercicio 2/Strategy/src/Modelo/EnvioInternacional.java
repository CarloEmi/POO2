package Modelo;

/**
 * Estrategia de envío internacional, con un costo y tiempo de entrega mayores.
 */


public class EnvioInternacional implements EstrategiaEnvio {

    @Override
    public double calcularCosto() {
        return 200.0; // Costo más alto para envío internacional
    }

    @Override
    public int calcularTiempoEntrega() {
        return 10; // Tiempo de entrega más largo en días
    }
}
