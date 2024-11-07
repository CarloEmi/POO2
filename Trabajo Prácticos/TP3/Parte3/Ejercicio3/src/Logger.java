import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private final FileWriter writer;
    private static Logger logger;

    private Logger() throws IOException {
        writer = new FileWriter("archivo.txt");
    }

    public static Logger getInstance() throws IOException {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void logError(String message) throws IOException {
        writer.write("[!] Error: " + message + "\n");
    }

    public void logInformacion(String message) throws IOException{
        writer.write("[+] Informacion: " + message + "\n");

    }

    public void logAdvertencia(String message) throws IOException{
        writer.write("[!] Advertencia: " + message + "\n");
    }

    public void close() throws IOException{
        writer.close();
    }

}