/*Escenario 4: Método que lanza múltiples excepciones
Descripción: Tienes un método que abre un archivo y lo lee, pero puede lanzar excepciones si el archivo no existe o si hay un error de entrada/salida.

*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

/**
 * La clase Escenario4 contiene métodos para leer archivos y manejar excepciones relacionadas.
 */
public class Escenario4 {

    /**
     * Lee el contenido de un archivo especificado.
     * Lanza excepciones si el archivo no existe o si hay un error de entrada/salida.
     *
     * @param rutaArchivo La ruta del archivo a leer
     * @throws NoSuchFileException si el archivo no existe
     * @throws IOException si ocurre un error de entrada/salida
     */
    public static void leerArchivo(String rutaArchivo) throws NoSuchFileException, IOException {
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (NoSuchFileException e) {
            throw new NoSuchFileException("Error: El archivo no existe -> " + rutaArchivo);
        } catch (IOException e) {
            throw new IOException("Error: Ocurrió un problema de entrada/salida al leer el archivo -> " + rutaArchivo, e);
        }
    }

    /**
     * El método principal que prueba la lectura de un archivo.
     * Intenta leer un archivo y maneja las posibles excepciones.
     *
     * @param args los argumentos de la línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        try {
            leerArchivo("ruta/a/tu/archivo.txt");
        } catch (NoSuchFileException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
