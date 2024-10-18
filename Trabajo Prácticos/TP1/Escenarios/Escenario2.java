/*Escenario 2: Método obsoleto con sugerencia de uso alternativo
Descripción: Tienes un método que ha quedado obsoleto, y quieres documentarlo para que no sea utilizado, sugiriendo un nuevo método.
*/
/**
 * La clase Metodos demuestra el uso de un método obsoleto y su alternativa recomendada.
 */
public class Escenario2 {

    /**
     * Método obsoleto que ya no se recomienda usar.
     * @deprecated Este método ha quedado obsoleto. Usa {@link #nuevoMetodo()} en su lugar.
     */
    @Deprecated
    public void metodoObsoleto() {
        System.out.println("Este método está obsoleto.");
    }

    /**
     * Nuevo método recomendado para su uso.
     */
    public void nuevoMetodo() {
        System.out.println("Este es el nuevo método recomendado.");
    }

    /**
     * El método principal que prueba tanto el método obsoleto como el nuevo.
     * Llama al método obsoleto para mostrar la advertencia y luego al método nuevo.
     *
     * @param args los argumentos de la línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        Escenario2 metodos = new Escenario2();
        
        // Este llamado es solo para mostrar la advertencia, no recomendado usar en código real
        metodos.metodoObsoleto();
        
        // Usar el método nuevo en su lugar
        metodos.nuevoMetodo();
    }
}

