package Modelo;

/**
 * Clase Pedido representa un pedido en la tienda, en el que se puede elegir
 * una estrategia de envío para calcular el costo y tiempo de entrega.
 */

public class Pedido {
    
    private EstrategiaEnvio estrategiaEnvio;

    /**
     * Establece la estrategia de envío para el pedido.
     *
     * @param estrategiaEnvio La estrategia de envío elegida.
     */
    public void setEstrategiaEnvio(EstrategiaEnvio estrategiaEnvio) {
        this.estrategiaEnvio = estrategiaEnvio;
    }

    /**
     * Calcula el costo del envío según la estrategia establecida.
     *
     * @return El costo de envío.
     */
    public double calcularCostoEnvio() {
        return estrategiaEnvio.calcularCosto();
    }

    /**
     * Calcula el tiempo estimado de entrega según la estrategia establecida.
     *
     * @return El tiempo estimado de entrega en días.
     */
    public int calcularTiempoEntrega() {
        return estrategiaEnvio.calcularTiempoEntrega();
    }
}