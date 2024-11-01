package Modelo;
/**
 * Interfaz para las estrategias de envío.
 * Define los métodos para calcular el costo y el tiempo estimado de entrega.
 */

public interface EstrategiaEnvio {

    /**
         * Calcula el costo de envío.
         *
         * @return El costo del envío.
         */
        double calcularCosto();

        /**
         * Calcula el tiempo estimado de entrega en días.
         *
         * @return El tiempo de entrega estimado en días.
         */
        int calcularTiempoEntrega();

}
