/*Escenario 3: Método con varios parámetros y retorno
Descripción: Tienes un método que calcula el índice de masa corporal (IMC) y devuelve un valor basado en el peso y la altura.
*/
/**
 * La clase IMC contiene métodos para calcular el Índice de Masa Corporal (IMC).
 */
public class Escenario3 {

    /**
     * Calcula el Índice de Masa Corporal (IMC) basado en el peso y la altura proporcionados.
     *
     * @param peso Peso en kilogramos
     * @param altura Altura en metros
     * @return El valor del IMC
     * @throws IllegalArgumentException si el peso o la altura son valores no válidos (menores o iguales a cero)
     */
    public static double calcularIMC(double peso, double altura) throws IllegalArgumentException {
        if (peso <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Error: Peso y altura deben ser mayores que cero.");
        }
        return peso / (altura * altura);
    }

    /**
     * El método principal que prueba el cálculo del IMC.
     *
     * @param args los argumentos de la línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        try {
            double imc = calcularIMC(70, 1.75);
            System.out.println("IMC: " + imc);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}

