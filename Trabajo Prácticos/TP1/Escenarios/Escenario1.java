/*Escenario 1: Método que lanza una excepción
Descripción: Tienes un método que divide dos números, pero puede lanzar una excepción si el divisor es cero.
*/

/**
 * La clase Escenario1 proporciona métodos para dividir dos números.
 */
public class Escenario1 {

    /**
     * Este metodo divide dos números dados.
     * Si el denominador es cero, lanza una excepción aritmética.
     *
     * @param numerador el número que será dividido
     * @param denominador el número por el cual se divide
     * @return el resultado de la división
     * @throws ArithmeticException si el denominador es cero
     */
    public static double dividir(double numerador, double denominador) throws ArithmeticException {
        if (denominador == 0) {
            throw new ArithmeticException("Error: No se puede dividir por cero.");
        }
        return numerador / denominador;
    }

    /**
     * El método principal que prueba el método de división.
     * Intenta dividir 10 por 0, lo que generará una excepción aritmética.
     *
     * @param args los argumentos de la línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        try {
            double resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }
}
